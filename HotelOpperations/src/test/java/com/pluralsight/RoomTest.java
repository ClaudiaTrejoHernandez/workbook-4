package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCheckInChangesOccupiedStatus() {

        //Arrange
        Room room = new Room();
        //Act
        boolean checkInResult = room.checkIn();
        //Assert
        assertTrue(checkInResult, "Check in should return true if the room is available");
        assertTrue(room.isOccupied(), "Room should be changed to occupied after check in.");
        System.out.println();
    }

    @Test
    void testCheckOutChangesOccupiedStatus() {

        //Arrange
        Room room = new Room();
        room.checkIn();
        //Act
        boolean checkOutResult = room.checkOut();
        //Assert
        assertTrue(checkOutResult, "Check out should return true if the room is occupied");
        assertFalse(room.isOccupied(), "Room should be changed to un-occupied after check out.");
        System.out.println();
    }

    @Test
    void testCleanRoomWhenNotOccupiedAndDirty() {

        //Arrange
        Room room = new Room();
        room.checkIn();
        room.checkOut();
        //Act
        boolean cleaned = room.cleanRoom();
        //Assert
        assertTrue(cleaned, "Room should be cleaned when unoccupied and dirty");
        assertFalse(room.isDirty(), "Room should not be dirty after cleaning.");
    }
}