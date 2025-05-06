package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(1,140.00,false,false);
        System.out.println("Room available: " + room.isAvailable());


        Reservation reservation = new Reservation("king",5,true);
        System.out.println(String.format("Total reservation cost: $%.2f", reservation.getReservationTotal()));

        Employee employee = new Employee("Emp001","Jake","Housekeeping",30.00, 42);
        System.out.println(String.format("Total pay: $%.2f", employee.getTotalPay()));


    }
}