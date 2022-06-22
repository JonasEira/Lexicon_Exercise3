package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getId() {
        int expected = 0;
        Car car = new Car("buick",1889, "red", 3.0);
        int actual = car.getId();
        assertEquals(expected, actual);

    }
}