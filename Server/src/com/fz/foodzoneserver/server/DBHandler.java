package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.RegisterRequest;
import com.fz.foodzoneserver.protocols.UpdatePasswordRequest;
import com.fz.foodzoneserver.protocols.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

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
            String checkPassword = "select u.Password from Users as u where u.Username = '" + request.getUsername() + "'";
            PreparedStatement st         = conn.prepareStatement(checkPassword);
            ResultSet         rs         = st.executeQuery();

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
}
