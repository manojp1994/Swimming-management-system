/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package connect_DB;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author MANOJ KUMAR
 */
public class swimmingDB {
    static Connection conn;
    public static Connection getConnectionDB() {
    
    try {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swimming","manoj","abcABC_123");
    }catch (Exception ex) {
        ex.printStackTrace();
    }
    return conn;    
    }
    
}
