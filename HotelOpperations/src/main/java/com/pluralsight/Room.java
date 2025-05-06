package com.pluralsight;

//Responsible for knowing everything related to a hotel room.
//A room is only available if it is clean and not currently occupied.
public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    //Derived getter - no backing variable; uses two existing variables to
    public boolean isAvailable() {
        return !occupied && !dirty;
    }

}
