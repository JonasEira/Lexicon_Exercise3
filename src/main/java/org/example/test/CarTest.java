package org.example.test;

import org.example.Car;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void test_getId() {
        //Prepare
        int expectedId = 1;
        Car car = new Car("Buick",1968,"red", 2.4);
        car.setId(expectedId);
        //Do
        int result = car.getId();
        //Analyze result
        Assertions.assertEquals(expectedId, result);
    }
}