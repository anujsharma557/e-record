package com.et.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @author: Anuj Sharma
 **/
public class ConnectionUtility {
    private static final Logger log= LoggerFactory.getLogger(ConnectionUtility.class);

    public static Connection getRemoteConnection() {
        String RDS_DB_NAME="e-terraindb";
        String RDS_USERNAME="admin";
        String RDS_PASSWORD="password";
        String RDS_HOSTNAME="e-terraindb.cc8acjcryiqe.ap-south-1.rds.amazonaws.com";
        String RDS_PORT="3306";



        if (RDS_HOSTNAME != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbName = RDS_DB_NAME;
                String userName = RDS_USERNAME;
                String password = RDS_PASSWORD;
                String hostname = RDS_HOSTNAME;
                String port = RDS_PORT;
                //jdbc:mysql://localhost:3306/sonoo","root","root")
                String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;
                System.out.println("jdbcUrl:"+jdbcUrl);
                Connection con = DriverManager.getConnection(jdbcUrl,userName,password);
                String query = "SELECT * FROM demo.Product";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                // iterate through the java resultset
                while (rs.next())
                {
                    int id = rs.getInt("Id");
                    String Type = rs.getString("Type");
                    String Brand = rs.getString("Brand");
                    String Mrp = rs.getString("Mrp");
                    String Discount = rs.getString("Discount");
                    // print the results
                    System.out.format("%s, %s, %s, %s, %s, %s\n", id, Type, Brand, Mrp, Discount);
                }
                st.close();
                System.out.println("connection:"+con);
                log.info("Remote connection successful.");
                return con;
            }
            catch (ClassNotFoundException e) { log.warn(e.toString());}
            catch (SQLException e) {

                log.warn(e.toString());}
        }
        return null;
    }
}
