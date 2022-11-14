package com.HotelBooking.Services;

import com.HotelBooking.Entity.Bill;
import com.HotelBooking.Entity.Client;
import com.HotelBooking.Entity.Hotel;
import com.HotelBooking.Entity.Room;

public class BookingServices {


    /*
    получаем все номера которые есть в отеле и проверяем не все ли они заняты
     */
    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();  // обьявляем массив номеров и получаем их из отеля
        boolean isFreeRooms = false;
        for (Room r : rooms) {  // в цыкле  нужно пройтись по массиву и посмотреть если там свободные номера
            if (r.isFreeRoom()) {
                isFreeRooms = true;
            }
        }


        if (!isFreeRooms) {
            System.out.println("We are sorry,but we don`t have a free rooms in our hotel"
                    + hotel.getHotelName());
        }


        for (Room room : rooms) {   // количество человек
            String Clientname = client.getName();
            String ClientSurname = client.getSurname();

            if (room.getNumberOfPerson() == numberOfPerson) {
                System.out.println("turned up a hotel room  for client :" + Clientname + ClientSurname);
                if (client.getBill().getSumOfmoney() >= room.getCostOfRoom()) {
                    Bill clientBill = client.getBill();
                    clientBill.setSumOfmoney((int) (clientBill.getSumOfmoney() - room.getCostOfRoom()));
                    room.setFreeRoom(false);
                    System.out.println("The room has been seccessful booked : "
                            + Clientname + ClientSurname);
                } else {
                    System.out.println("You don`t have enought money, client : " + Clientname + ClientSurname);
                }
            } else {
                System.out.println("no one room for client : " + Clientname + ClientSurname);
            }
        }
    }
}
