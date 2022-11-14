package com.HotelBooking.Entity;

public class Room {
    private int numberOfPerson;
    private double costOfRoom;
    private boolean freeRoom;


    /*
    constructor
     */
    public Room(int numberOfPerson, double costOfRoom, boolean freeRoom) {
        this.numberOfPerson = numberOfPerson;
        this.costOfRoom = costOfRoom;
        this.freeRoom = freeRoom;
    }

    /*
    Getter and Setter
     */

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public double getCostOfRoom() {
        return costOfRoom;
    }

    public void setCostOfRoom(double costOfRoom) {
        this.costOfRoom = costOfRoom;
    }

    public boolean isFreeRoom() {
        return freeRoom;
    }

    public void setFreeRoom(boolean freeRoom) {
        this.freeRoom = freeRoom;
    }
}
