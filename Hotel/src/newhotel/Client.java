/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

import java.util.ArrayList;

/**
 *
 * @author Salma
 */
public class Client {
     //not sure if to put it in here or in accounts
    public static ArrayList<Client> Cli = new ArrayList<Client>();
    
    private String Fname;           //Client's First Name
    private String Lname;           //Client's Last Name
    private String Ssn;                //Social security number
    private String DOB;             //Date of Birth
    private String Address;         //Address 
    private String Mobile;          //Phone number
    private String Email;           //Email
    private String username;
    
    
    
    
    
    public Client() {
        Fname="";
        Lname="";
        Ssn = "";
        DOB = "";
        Address = "";
        Mobile = "";
        Email = "";
        username= "";
    }
    
    public Client(String Fname, String Lname, String Ssn, String DOB, String Address, String Mobile, String Email,String username){
       
        this.Fname = Fname;
        this.Lname = Lname;
        this.Ssn = Ssn;
        this.DOB = DOB;
        this.Address = Address;
        this.Mobile = Mobile;
        this.Email = Email;
        
    }

    public static ArrayList<Client> getClients() {
        return Cli;
    }
    
    
    
    
}
