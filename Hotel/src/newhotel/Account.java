/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Salma
 */
public class Account {
    
    Scanner input = new Scanner( System.in );
   
    private static HashMap<String,String> Staff = new HashMap<String,String>();
    private static HashMap<String,String> Clients = new HashMap<String,String>();
    
    //********************************//
    //     Account class Atturbutes   //
    //********************************// 
    private String username;
    private String password;
    
    
    
    //********************************//
    //      Default Constructor       //
    //********************************// 
    public Account(){
        username = "";
        password = "";
        AddStaff();
        AddClient();
    }
    
    
    //********************************//
    //    Overloaded Constructor      //
    //********************************// 
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        
    }

    
    
    //********************************//
    //   Registration For Clients     //
    //********************************//   
     protected void Register(String user,String pass, String Fname, String Lname, String Ssn, String DOB, String Address, String Mobile, String Email){
         
        
            Clients.put(user, pass);
            Client s = new Client( Fname,  Lname,  Ssn,  DOB,  Address,  Mobile,  Email, user);
            Client.getClients().add(s);
        
        
       
    }
     
    //********************************//
    //       Login for Clients        //
    //********************************//   
    
    protected boolean LoginClient (String user, String pass ){
       boolean login = false;

            if(Clients.containsKey(user)){
               if(Clients.get(user).equals(pass)){
               
                   JOptionPane.showMessageDialog(null, "Login Successful");
                   login = true;
               }
               else
                   JOptionPane.showMessageDialog(null, "Password Incorrect");
               
           }
           else
               JOptionPane.showMessageDialog(null, "Invalid username");
        
        return login;
        
    }
    
    //********************************//
    //       Staff Accounts           //
    //********************************//   
    
    public void AddStaff(){
        
        Staff.put("Salma", "Salma123");
        Staff.put("Ali", "Ali123");
        Staff.put("Mai", "Mai123");
        Staff.put("Nada", "Nada123");
        
    }
   
    public void AddClient(){
       Clients.put("Hani", "Hani123");
       Clients.put("Mohamed","Yassin123");
       Clients.put("Hanaa", "Abdou123");
    }
   
    //********************************//
    //       Login for Employees      //
    //********************************//   
    
    protected boolean ELogin(String user,String pass){
        boolean login = false;

            if(Staff.containsKey(user)){
               if(Staff.get(user).equals(pass)){
               
                   JOptionPane.showMessageDialog(null, "Login Successful");
                   login = true;
               }
               else
                   JOptionPane.showMessageDialog(null, "Password Incorrect");
               
           }
           else
               JOptionPane.showMessageDialog(null, "Invalid username");
        
        return login;
    }
    

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static boolean checkUsername(String username){
        return Clients.containsKey(username);
    }
    
}
