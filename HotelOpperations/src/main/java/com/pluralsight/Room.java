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

    public Room() {

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

    //Methods:

    public boolean checkIn() {

        if (isAvailable()) {
            System.out.println("You are now checked in.");
            occupied = true;
            dirty = true;
            return true;
        }else {
            System.out.println("Sorry, the room is not available for check in.");
            return false;
        }

    }

    public boolean checkOut() {

        if (occupied) {
            occupied = false;
            dirty = true;
            System.out.println("You are checking out.");
            return true;
        }else {
            System.out.println("Room was not occupied. Cannot check out of an empty room.");
            return false;
        }
    }

    public boolean cleanRoom() {

        if (!isOccupied() && isDirty()) {
            System.out.println("Cleaning room.");
            dirty = false;
            return true;
        }else {
            System.out.println("Room cannot be cleaned now.");
            return false;
        }

    }

}
