package com.HotelBooking;

import com.HotelBooking.Entity.Bill;
import com.HotelBooking.Entity.Client;
import com.HotelBooking.Entity.Hotel;
import com.HotelBooking.Entity.Room;
import com.HotelBooking.Services.BookingServices;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        Bill ClientBill1 = new Bill(550);

        Client firstClien = new Client("firstClien", "firstClien",
                "380637951034", "traine41@icloiud.com", ClientBill1);


        Bill ClientBill2 = new Bill(140);
        Client secondClient = new Client("secondClient", "secondClient",
                "380647951022", "rospsix@gmail.com", ClientBill2);

/*
First Hotel California Hotel and Rooms which he included
 */
        Room[] californiaHotelRooms =
                new Room[]{new Room(2, 220, true),
                        new Room(4, 440, true),
                        new Room(6, 660, true)};

        Hotel californiaHotel = new Hotel("Califronia", californiaHotelRooms);

        /*
        Second Hotel  San-Francisco Hotel and Rooms which he included
         */
        Room[] sanFranciscoHotelRooms = new Room[]{new Room(2, 400, true),
                new Room(4, 680, true),
                new Room(6, 1000, true)};
Hotel sanFranciscoHotel = new Hotel("sanfrancisco",sanFranciscoHotelRooms);

        BookingServices bookingServices = new BookingServices();

        bookingServices.book(californiaHotel,firstClien,2);
        System.out.println("///////////////////");
        bookingServices.book(californiaHotel,firstClien,3);
        System.out.println("///////////////////////");
        bookingServices.book(sanFranciscoHotel,secondClient,2);
        bookingServices.book(sanFranciscoHotel,secondClient,6);
        bookingServices.book(sanFranciscoHotel,secondClient,3);

    }
}
