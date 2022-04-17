package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.*;


//class Restaurant{
//    public String Branch_ID,
//            Branch_Name,
//            Branch_Address,
//            Branch_image,
//            Branch_Location_Longtitude,
//            Branch_Location_Latitude = "NULL";
//    public Restaurant(){}
//    public Restaurant(String Branch_ID,String Branch_Name,String Branch_Address,String Branch_image,
//                      String Branch_Location_Longtitude, String Branch_Location_Latitude){
//        this.Branch_ID = Branch_ID;
//        this.Branch_Name = Branch_Name;
//        this.Branch_Address = Branch_Address;
//        this.Branch_image = Branch_image;
//        this.Branch_Location_Longtitude = Branch_Location_Longtitude;
//        this.Branch_Location_Latitude = Branch_Location_Latitude;
//    }
//}

//Each time using the new query, you have to create new dbhandler
public class DBHandler {
    private static Logger logger = LogManager.getLogger(DBHandler.class.getName());
    private Connection conn;
    // Constructor to get conn by the parameter Connection conn
    public DBHandler(Connection conn){
        this.conn = conn;
    }
    // Constructor to get conn from pool if there is a idle connection in pool
    public DBHandler() throws SQLException {
        this.conn = ConnectionPool.getInstance().getConnection();
    }

    public String queryLogin(String user, String password) {
        String result;
        try{
            String sqlState = "select u.Username, u.Password from Users as u where u.Username = '" + user + "'";
            PreparedStatement st = conn.prepareStatement(sqlState);
            ResultSet rs = st.executeQuery();
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
            String sqlState = "select u.Fullname, u.ID, u.Address, u.Phone, u.Image from Users as u where u.Username = '" + user + "'";
            PreparedStatement st = conn.prepareStatement(sqlState);
            ResultSet rs = st.executeQuery();
            String temp;
            rs.next();
            // Set fullname
            temp = rs.getString(1);
            info.setFullname(temp == null? "NULL" : temp);
            // Set id
            temp = rs.getString(2);
            info.setId(temp == null? "NULL" : temp);
            // Set address
            temp = rs.getString(3);
            info.setAddress(temp == null? "NULL" : temp);
            // Set phone
            temp = rs.getString(4);
            info.setPhone(temp == null? "NULL" : temp);
            // Set image name
            temp = rs.getString(5);
            info.setImgName(temp == null? "NULL" : temp);
            st.close();
            rs.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return info.build();
    }

    public void releaseConn() {
        try {
            conn.close();
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
