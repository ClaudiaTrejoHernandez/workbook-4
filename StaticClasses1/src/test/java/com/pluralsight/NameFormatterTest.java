package com.pluralsight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format() {

        //Arrange
        String firstname = "Claudia";
        String lastname = "Hernandez";
        String actualLastFirst = "Hernandez, Claudia";
        //Act
        String expectedLastFirst = NameFormatter.format(firstname, lastname);
        //Assert
        assertEquals(actualLastFirst, expectedLastFirst);
    }
}