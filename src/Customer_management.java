
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANOJ KUMAR
 */
public class Customer_management {
    public boolean doRegistration(Customer_registration cr) throws SQLException {
        boolean success = false;
        String Entryquery = "INSERT INTO Customers(Name,Mobile_No,start_date,status,Amount)VALUES(?,?,?,?,?)";
        Connection con = new DbConnection().getConnection();
        PreparedStatement statement1 = con.prepareStatement(Entryquery);
//        statement1.setString(1, cr.getID()+"");
        statement1.setString(1, cr.getName());
        statement1.setString(2, cr.getContact()+"");
        statement1.setString(3, cr.getStart_Date());
        statement1.setString(4, cr.getStatus()+"");
        statement1.setString(5, cr.getAmount()+"");
        int confirmationresult;
        confirmationresult = statement1.executeUpdate();
        System.out.println("---- "+confirmationresult);
        if(confirmationresult > 0) {
            success = true;
        } else {
        }
        return success;
    }
    
    /**
     *
     * @param cr1
     * @return
     * @throws java.sql.SQLException
     */
    public ResultSet getCustomers(Customer_registration cr1)  throws SQLException {
       
        try {
            Connection conn = swimmingDB.getConnectionDB();
            Statement state = conn.createStatement();
            ResultSet all_details = state.executeQuery("select * from customers");
            System.out.printf("all_detials"+all_details);
            return all_details;
        }catch (Exception e) {
        }
    return null;   
    }
}
