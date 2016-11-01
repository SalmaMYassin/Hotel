/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Salma
 */
public class StaffMember {
   
    
     public StaffMember() {
      
    }
    
    public StaffMember(String username, String password){
        
        
    }
    
    public boolean setRoomDesc(int num,String desc) {
        for (HotelRoom i : HotelRoom.getRooms()){
            if(i.getNum() == num){
                i.setDesc(desc);
                return true;
            }
            
            
        }
        return false;
                
    }

    public boolean setRoomPrice(int num, double price) {
        for (HotelRoom i : HotelRoom.getRooms()){
                    System.out.print("badawar ya fandem\n");
                    if(i.getNum() == num){
                        System.out.print("La2tha ya fandem\n");
                        i.setPrice(price);
                        return true;
                    }


                }
        return false;
    }
    public void AddRoom(int num, String type,String desc, double price){
        HotelRoom newRoom = new HotelRoom(num,type,desc,price,true);
        HotelRoom.getRooms().add(newRoom);
    }
    
    
}
