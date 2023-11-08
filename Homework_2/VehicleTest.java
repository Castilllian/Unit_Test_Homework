package Homework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car("Company", "Model", 2021);
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Vehicle car = new Car("Company", "Model", 2021);
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2021);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Vehicle car = new Car("Company", "Model", 2021);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedAfterParking() {
        Vehicle car = new Car("Company", "Model", 2021);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterParking() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}

