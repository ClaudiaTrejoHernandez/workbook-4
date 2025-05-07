package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(1,140.00,false,false);
        System.out.println("Room available: " + room.isAvailable());
        System.out.println("Number of beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());

        Reservation reservation = new Reservation("king",5,true);
        System.out.println(String.format("Total reservation cost: $%.2f", reservation.getReservationTotal()));

        Employee employee = new Employee("Emp01", "", "", 25, 15, 2.45, 11.15);
        System.out.println(String.format("Total pay: $%.2f", employee.getTotalPay()));


    }
}