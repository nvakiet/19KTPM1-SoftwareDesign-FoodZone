package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.*;
import com.google.protobuf.ProtocolStringList;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Each time using the new query, you have to create new dbhandler
public class DBHandler {
    private static Logger     logger = LogManager.getLogger(DBHandler.class.getName());
    private        Connection conn;

    // Constructor to get conn by the parameter Connection conn
    public DBHandler(Connection conn) {
        this.conn = conn;
    }

    // Constructor to get conn from pool if there is a idle connection in pool
    public DBHandler() throws SQLException {
        this.conn = ConnectionPool.getInstance().getConnection();
    }

    public String queryLogin(String user, String password) {
        String result;
        try {
            String            sqlState = "select u.Username, u.Password from Users as u where u.Username = '" + user + "'";
            PreparedStatement st       = conn.prepareStatement(sqlState);
            ResultSet         rs       = st.executeQuery();
            // if username is invalid
            if (!rs.next())
                result = "Invalid username";
                // if password is incorrect
            else if (!password.equals(rs.getString("Password")))
                result = "Incorrect password";
                // Else login success
            else result = "Success";
            st.close();
            rs.close();
        } catch (SQLException e) {
            logger.error(e);
            result = "Query Error";
        }
        return result;
    }

    public UserInfo queryUserInfo(String user) {
        UserInfo.Builder info = UserInfo.newBuilder();
        info.setUsername(user);
        try {
            String            sqlState = "select u.Fullname, u.ID, u.Address, u.Phone, u.Image from Users as u where u.Username = '" + user + "'";
            PreparedStatement st       = conn.prepareStatement(sqlState);
            ResultSet         rs       = st.executeQuery();
            String            temp;
            rs.next();
            // Set fullname
            temp = rs.getString(1);
            info.setFullname(temp == null ? "NULL" : temp);
            // Set id
            temp = rs.getString(2);
            info.setId(temp == null ? "NULL" : temp);
            // Set address
            temp = rs.getString(3);
            info.setAddress(temp == null ? "NULL" : temp);
            // Set phone
            temp = rs.getString(4);
            info.setPhone(temp == null ? "NULL" : temp);
            // Set image name
            temp = rs.getString(5);
            info.setImgName(temp == null ? "NULL" : temp);
            st.close();
            rs.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return info.build();
    }

    public String insertUser(RegisterRequest request) {
        String result;
        try {
            // Check if the user already exists
            String            checkExist = "select u.Username from Users as u where u.Username = '" + request.getUsername() + "'";
            PreparedStatement st         = conn.prepareStatement(checkExist);
            ResultSet         rs         = st.executeQuery();
            if (rs.next()) {
                result = "Username already exists";
                rs.close();
                st.close();
                return result;
            }
            // Insert the new user
            rs.close();
            st.close();
            String sqlInsert = "insert into Users (Username, Password, Fullname, ID, Address, Phone, Image) values (?,?,?,?,?,?,?)";
            st = conn.prepareStatement(sqlInsert);
            st.setString(1, request.getUsername());
            st.setString(2, request.getPassword());
            st.setString(3, request.getFullname());
            st.setString(4, request.getId());
            st.setString(5, request.getAddress());
            st.setString(6, request.getPhone());
            st.setNull(7, Types.NVARCHAR);
            st.executeUpdate();
            st.close();
            result = "Success";
        } catch (SQLIntegrityConstraintViolationException constraintViolationException) {
            logger.error(constraintViolationException);
            result = "New user data violates database constraints";
        } catch (SQLException e) {
            logger.error(e);
            result = "Query Error";
        }
        return result;
    }

    public void releaseConn() {
        try {
            conn.close();
        } catch (Exception e) {
            logger.error(e);
        }
    }

    public String updateUserInfo(UserInfo request) {
        try {
            String sqlUpdate = "update Users " +
                    "set Fullname = ?, ID = ?, Address = ?, Phone = ?, Image = ? " +
                    "where Username = ?";
            PreparedStatement st = conn.prepareStatement(sqlUpdate);
            st.setString(1, request.getFullname());
            st.setString(2, request.getId());
            st.setString(3, request.getAddress());
            st.setString(4, request.getPhone());
            st.setString(5, request.getImgName());
            st.setString(6, request.getUsername());
            st.executeUpdate();
            st.close();
            return "Success";
        } catch (SQLIntegrityConstraintViolationException constraintViolationException) {
            return "New user data violates database constraints";
        } catch (SQLException e) {
            return "Query Error";
        }
    }

    public String updateUserPassword(UpdatePasswordRequest request) {
        try {
            String            checkPassword = "select u.Password from Users as u where u.Username = '" + request.getUsername() + "'";
            PreparedStatement st            = conn.prepareStatement(checkPassword);
            ResultSet         rs            = st.executeQuery();

            // Check old password
            if (!rs.getString(1).equals(request.getOldPassword())) {
                rs.close();
                st.close();
                return "Old password field does not match your current password";
            }

            // Update to new password
            rs.close();
            st.close();

            String sqlUpdate = "update Users " +
                    "set Password = ?" +
                    "where Username = ?";

            st = conn.prepareStatement(sqlUpdate);
            st.setString(1, request.getNewPassword());
            st.setString(2, request.getUsername());
            st.executeUpdate();
            st.close();
            return "Success";
        } catch (SQLIntegrityConstraintViolationException constraintViolationException) {
            return "New user data violates database constraints";
        } catch (SQLException e) {
            return "Query Error";
        }
    }

    public String queryRestaurantList() {
        // TODO handle request params
        String result = "Success";

        return result;
    }

    public List<RestaurantInfo> queryAllRestaurant() {
        List<RestaurantInfo> result = new ArrayList<>();

        try {
            String            sqlState = "select u.RestaurantID, u.Name, u.Address, u.Image from Restaurant as u";
            PreparedStatement st       = conn.prepareStatement(sqlState);
            ResultSet         rs       = st.executeQuery();

            while (rs.next()) {
                RestaurantInfo.Builder restaurant = RestaurantInfo.newBuilder();
                restaurant.setID(rs.getString(1));
                restaurant.setName(rs.getString(2));
                restaurant.setAddress(rs.getString(3));

                String tmp = rs.getString(4);
                restaurant.setImage(tmp == null ? "NULL" : tmp);

                result.add(restaurant.build());
            }

            st.close();
            rs.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return result;
    }

    public String queryFoodList() {
        // TODO handle request params
        String result = "Success";

        return result;
    }

    public List<FoodInfo> queryFood(FoodListRequest request) {
        List<FoodInfo> result = new ArrayList<>();

        try {
            String            sqlState = "select u.MealID, u.Name, u.Description, u.Price, u.Image from Meal as u where u.RestaurantID = '" + request.getRestaurantID() + "'";
            PreparedStatement st       = conn.prepareStatement(sqlState);
            ResultSet         rs       = st.executeQuery();

            while (rs.next()) {
                FoodInfo.Builder food = FoodInfo.newBuilder();
                food.setID(rs.getString(1));
                food.setName(rs.getString(2));
                food.setDescription(rs.getString(3));
                food.setPrice(rs.getInt(4));

                String tmp = rs.getString(5);
                food.setImage(tmp == null ? "NULL" : tmp);

                result.add(food.build());
            }

            st.close();
            rs.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return result;
    }

    public String insertRecipient(String orderID, String name, String ID, String address, String phone, String email) {

        try {
            String            sqlInsert = "insert into Recipient (OrderID, Fullname, ID, Address, Phone, Email) values (?,?,?,?,?,?)";
            PreparedStatement st        = conn.prepareStatement(sqlInsert);

            st.setString(1, orderID);
            st.setString(2, name);
            st.setString(3, ID);
            st.setString(4, address);
            st.setString(5, phone);
            st.setString(6, email);
            st.executeUpdate();
            st.close();

            return "Success";
        } catch (SQLException e) {
            return "Query Error";
        }
    }

    public String insertOrder(String orderID, String datetime, String state) {
        try {
            String            sqlInsert = "insert into [Order] (OrderID, OrderDateTime, [State]) values (?,?,?)";
            PreparedStatement st        = conn.prepareStatement(sqlInsert);

            st.setString(1, orderID);
            st.setString(2, datetime);
            st.setString(3, state);
            st.executeUpdate();
            st.close();

            return "Success";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "Query Error";
        }
    }

    public String insertOrderDetails(String orderID, ProtocolStringList mealIDList, List<Integer> mealQuantityList) {
        try {
            String            sqlInsert = "insert into OrderDetails (OrderID, MealID, MealQuantity) values (?,?,?)";
            PreparedStatement st        = conn.prepareStatement(sqlInsert);

            st.setString(1, orderID);

            for (int i = 0; i < mealIDList.size(); ++i) {
                st.setString(2, mealIDList.get(i));
                st.setInt(3, mealQuantityList.get(i));
                st.addBatch();
            }

            st.executeBatch();
            st.close();

            return "Success";
        } catch (SQLException e) {
            return "Query Error";
        }
    }

    public List<Order> queryUserHistory(String username) {
        List<Order> result = new ArrayList<>();

        try {
            String sqlOrder = "" +
                    "select OrderDateTime, [Desc], [State], RecipientName, Price, Restaurant from " +
                    "(select OrderID, o.OrderDateTime, o.[State] from [Order] as o " +
                    "WHERE o.OrderID LIKE '" + username + "%') t1 " +
                    "inner join" +
                    "(select OrderID, STRING_AGG(CONCAT(Meal.[Name], ' x', MealQuantity), '---') as [Desc] " +
                    "from OrderDetails, Meal " +
                    "where OrderDetails.MealID = Meal.MealID " +
                    "and OrderID like '" + username + "%'" +
                    "group by OrderID) t2 on t1.OrderID = t2.OrderId " +
                    "inner join " +
                    "(select OrderID, Fullname as recipientName " +
                    "from Recipient " +
                    "where OrderID like '" + username + "%') t3 on t2.OrderID =  t3.OrderID " +
                    "inner join " +
                    "(select OrderID, sum(OrderDetails.MealQuantity*Meal.Price) as price from OrderDetails, meal " +
                    "where OrderDetails.MealID = meal.MealID " +
                    "group by OrderID) t4 " +
                    "on t3.OrderID = t4.OrderID " +
                    "inner join " +
                    "(select distinct OrderID, Restaurant.[Name] as Restaurant from OrderDetails, Meal, Restaurant " +
                    "where OrderDetails.MealID = Meal.MealID " +
                    "and Meal.RestaurantID = Restaurant.RestaurantID) t5 " +
                    "on t4.OrderID = t5.OrderID" +
                    "order by t1.OrderID desc";

            PreparedStatement st = conn.prepareStatement(sqlOrder);
            ResultSet         rs = st.executeQuery();

            while (rs.next()) {
                Order.Builder order = Order.newBuilder();
                order.setDate(rs.getString(1))
                        .setDesc(rs.getString(2))
                        .setState(rs.getString(3))
                        .setRecipientName(rs.getString(4))
                        .setPrice(rs.getInt(5))
                        .setRestaurant(rs.getString(6));
                result.add(order.build());
            }

            st.close();
            rs.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return result;
    }
}
