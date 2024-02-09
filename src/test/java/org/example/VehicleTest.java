package org.example;

import org.junit.Assert;
import org.junit.Test;


import static org.assertj.core.api.Assertions.*;


public class VehicleTest {

    @Test
    public void carExtendsVehicleTest() {
        Car car = new Car();
        assertThat(car instanceof Vehicle);

    }

    @Test
    public void carWheelsNumberTest() {
        Car car = new Car("Ferrari", "model", 2022);
        Assert.assertEquals(4, car.getNumWheels());

    }
    @Test
    public void motorcycleWheelsNumberTest() {
        Motorcycle motorcycle = new Motorcycle("Honda", "model", 2022);
        Assert.assertEquals(2, motorcycle.getNumWheels());

    }
    @Test
    public void carSpeedTestDriveTest() {
        Car car = new Car();
        car.testDrive();
        Assert.assertEquals(60, car.getSpeed());

    }
    @Test
    public void carSpeedStopTest() {
        Car car = new Car();
        car.testDrive();
        car.park();
        Assert.assertEquals(0, car.getSpeed());

    }
    @Test
    public void motorcycleSpeedTestDriveTest() {
        Motorcycle motorcycle = new Motorcycle("Honda", "model", 2022);
        motorcycle.testDrive();
        Assert.assertEquals(75, motorcycle.getSpeed());

    }
    @Test
    public void motorcycleSpeedStopTest() {
        Motorcycle motorcycle = new Motorcycle("Honda", "model", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        Assert.assertEquals(0, motorcycle.getSpeed());

    }


}