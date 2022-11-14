package com.HotelBooking.Entity;

public class Hotel {
    private String HotelName;
    private Room[] rooms;

/*
constructor
 */
    public Hotel(String hotelName, Room[] rooms) {
        HotelName = hotelName;
        this.rooms = rooms;
    }

    /*
    Getter and Setter
     */

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
