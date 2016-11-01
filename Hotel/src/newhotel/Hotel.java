/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

import java.util.ArrayList;
import newhotel.*;

/**
 *
 * @author Salma
 */
public class Hotel {
    
    public Hotel() {
    }
    public static void main(String[] args) 
    {
        HotelRoom n = new HotelRoom();
               HotelRoom a0 = new HotelRoom(100,"Single","Sea View", 399.9, true);
        HotelRoom a1 = new HotelRoom(101,"Double","Pool View", 499.9, true);
        HotelRoom a2 = new HotelRoom(102,"Single","Sea View", 399.9, false);
        HotelRoom a3 = new HotelRoom(103,"Triple","Garden View", 599.9, false);
        HotelRoom a4 = new HotelRoom(104,"Double","Pool View", 499.9, true);
        HotelRoom a5 = new HotelRoom(105,"Single","Garden View", 299.9, true);
        HotelRoom a6 = new HotelRoom(106,"Single","Sea View", 399.9, false);
        HotelRoom a7 = new HotelRoom(107,"Triple","Garden View", 499.9, true);
        HotelRoom a8 = new HotelRoom(108,"Single","Sea View", 399.9, false);
        n.getRooms().add(a0);
        n.getRooms().add(a1);
        n.getRooms().add(a2);
        n.getRooms().add(a3);
        n.getRooms().add(a4);
        n.getRooms().add(a5);
        n.getRooms().add(a6);
        n.getRooms().add(a7);
        n.getRooms().add(a8);
        Home h = new Home ();
        h.setVisible(true);
    }
}
