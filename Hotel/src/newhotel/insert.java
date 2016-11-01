/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class insert {
   public void insrt(String Username,String Password,String Fname){
   String connectionURL= "jdbc:derby://localhost:1527/Hotel";

        try 
        {

            Connection conn = DriverManager.getConnection(connectionURL, "salma", "salma");
            Statement st = conn.createStatement();
            String sql = "INSERT INTO NEW (Username, Password,FNAME ) VALUES ("+Username+", '"+Password+"', '"+Fname+"')";

            st.executeUpdate(sql);
            st.close();
            conn.close(); 
        } 
        catch (SQLException ex) 
        {
            System.out.println("Connect failed ! ");
        }

}
}

