/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Salma
 */
public class HotelRoom {

    /**
     *
     */
    private static ArrayList<HotelRoom> Rooms = new ArrayList<HotelRoom>(); 
    private static HashMap<Integer,Integer> BR = new HashMap<Integer,Integer>();
  
    
    //*******************************//
    //     Hotel Room Attrbutes      //
    //*******************************//
    private int num;            //Room Number
    private String type;        //Room type
   
    private String desc;        //Room Description 
    
    private double price;       //Room price per night
    private boolean available;  //to check if the room is available
    private static int BookingR = 1;
    
    //*******************************//
    //      Default constructor      //
    //*******************************// 
    public HotelRoom() {
       
    }
    
    //*******************************//
    //     Overloaded Constructor    //
    //*******************************//
    public HotelRoom(int num, String type,String desc, double price, boolean available) {
        HotelRoom R = new HotelRoom(); 
        R.num = num;
        R.type = type;
        
        switch(type){                   //Setting Defult Description for Every Room type
            case "Single":
            case "single":
                R.desc="Maximum occupancy: 1 guest. Rooms are small and suitable for 1 person for short stay.";
                break;
            case "Twin":
            case "twin":
                R.desc="2 single beds. Maximum occupancy: 2 guests";
                break;
            case "Double":
            case "double":
                R.desc="1 double bed. Maximum occupancy: 2 guests.";
                break;
            case "Triple":
            case "triple":
                R.desc="1 double bed + 1 single bed. Maximum occupancy: 3 guests.";
                break;
            case "Family":
            case "family":
                R.desc="2 double beds. Maximum occupancy:4.";
                break;
            case "Suite":
            case "suite":
                R.desc="2 bedrooms connected by shared entrance. 1 double bed + 2 single beds. Standard occupancy: 4 guests.";
                break;
        }
        R.desc = desc + "\n" + R.desc;        // for extra decription for each room
        
        R.price = price;
        R.available = available;
        if(!R.isAvailable()){
            BR.put(BookingR++, R.num);
        }
        Rooms.add(R);
        
    }
    
    //*******************************//
    //         Needed Setters        //
    //*******************************// 
    public void setDesc(String desc) {
        this.desc = desc + "\n" +this.desc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //*******************************//
    //        Needed Getters         //
    //*******************************//
    public int getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public static ArrayList<HotelRoom> getRooms() {
        return Rooms;
    }

    public int getBookingR() {
        return BookingR;
    }
    
    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
    
    public String AvailableRoom(){ 
        String s = "";
        for(HotelRoom i : Rooms){
            if(i.available){
                 s = s +"Room Number: "+i.num+"\nRoom Type: "+i.type+"\nDescription: "+i.desc+"\nPrice: "+i.price + "\n";
                 s = s + "-----------------------------------------------------\n";
            }
        }
        if("".equals(s))
             return "No Available Rooms";
        else
            return s;
    }
    
    public boolean Exist = false ; 
    public String Book(int Num){
        String BK ;
        for(HotelRoom i : Rooms){
            if(i.getNum() == Num){
                System.out.print("La2tha yafandeem\n");
                if(i.isAvailable()){
                    System.out.print("available yafandeem\n");
                     i.setAvailable(false);
                     BK = Integer.toString(i.getBookingR());
                     BR.put(BookingR++, i.num);
                     Exist = true;
                     return BK;
                }
                else
                {
                    Exist = false;
                    return "Room is Not Available";
                }
            }
        }
        return "Room Not Found";
    }
    public boolean DeleteBooking(int br){
        int Num;
        if(BR.containsKey(br)){
            Num = BR.get(br);
            for(HotelRoom i : Rooms){
            if(i.num == Num){
                i.setAvailable(true);
                return true;
        
                }
            }
        }
        else
            return false;
        
        return false;
    }
    public String CheckBR(int br){
        int Num;
        if(BR.containsKey(br)){
            Num = BR.get(br);
            for(HotelRoom i : Rooms){
            if(i.num == Num){
                return "Room Number: "+i.num+"\nRoom Type: "+i.type+"\nDescription: "+i.desc+"\nPrice: "+i.price;
        
                }
            }
        }
        else
            return "Invaild Booking Referance";
        
        return "Invaild Booking Referance";
       
    }
    

    public String CheckDesc(int Num){
        for(HotelRoom i : Rooms){
            if(i.num == Num)
                    return "Room Number: "+i.num+"\nRoom Type: "+i.type+"\nDescription: "+i.desc+"\nPrice: "+i.price; 
                
        }
        return "Room Not Found";
       
    }
    
}
