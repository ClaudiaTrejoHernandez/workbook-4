package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = 0;
        this.numberOfRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //Derived getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    //Methods
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {

        if (isSuite) {
            int availableSuites = getAvailableSuites();
            if (availableSuites > 0) {
                bookedSuites += numberOfRooms;
                return true;
            }else {
                return false;
                }
            }else {
                int availableRooms = getAvailableRooms();
                if (availableRooms > 0) {
                    bookedBasicRooms += numberOfRooms;
                    return true;
                }else {
                    return false;
                }
            }
    }

}
