package com.pluralsight;

//Responsible for storing information related to a guest stay.
public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        double basePrice;
        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else {
            basePrice = 124.00;
        }

        if (isWeekend) {
            basePrice *= 1.10;
        } return basePrice;

    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }

}

//    public String pricePerNight() {
//        try {
//
//            if (!isWeekend() && roomType.equalsIgnoreCase("king")) {
//                double pricePerNight = 139.00 + (139.00 * .1);
//                return "Price per Night for a King Room on a Weekend: $" + pricePerNight;
//            }
//            if (!isWeekend() && roomType.equalsIgnoreCase("double")) {
//                double pricePerNight = 124.00 + (124.00 * .1);
//                return "Price per night for a Double Room on a Weekend: $" + pricePerNight;
//
//            }
//            if (isWeekend && roomType.equalsIgnoreCase("king")) {
//                double pricePerNight = 139.00;
//                return "Price per Night for a King Room on a Weekday: $" + pricePerNight;
//            }
//            if (roomType.equalsIgnoreCase("double")) {
//                double pricePerNight = 124.00;
//                return "Price per night for a Double Room on a Weekday: $" + pricePerNight;
//
//            }
//        } catch (Exception e) {
//            System.out.println("Please type valid room type: ");
//        }
//        return null;
//    }


