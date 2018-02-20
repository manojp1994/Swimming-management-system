

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANOJ KUMAR
 */
public class Customer_registration {
    private String Name = "";
    private int ID = 0;
    private String Contact = "";
    private int Status = 0;
    private String Amount = "";
    private String Start_Date="";
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }
    
    public String getStart_Date() {
        return Start_Date;
    }
    
    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }
    
}
