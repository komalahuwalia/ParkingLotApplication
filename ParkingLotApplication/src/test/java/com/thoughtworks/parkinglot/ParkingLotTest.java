package com.thoughtworks.parkinglot;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertTrue;

public class ParkingLotTest {

    private ParkingLot parkingLot;
    private final String carNumber = "MH 12 - A1 - 1234";

    @Before
    public void setUp() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void shouldBeAbleGetAValidParkingTicketAfterParkingACar() {
        Car car = new Car(carNumber);
        ParkingTicket ticket = parkingLot.park(car);
        assertEquals(carNumber,ticket.getNumber());

    }

    @Test
    public void shouldBeAbleToFindMyCarFromParkingTicket() {
        Car car = new Car(carNumber);
        ParkingTicket ticket = parkingLot.park(car);
        Car parkedCar = parkingLot.find(ticket);
        assertEquals(car.getNumber(), parkedCar.getNumber());
    }

    @Test
    public void shouldReturnNullIfCarIsNotParked(){
        Car nullCar = parkingLot.find(new ParkingTicket(carNumber));
        assertNull(nullCar);
    }

    @Test
    public void shouldBeAbleToUnParkCar(){
        ParkingTicket ticket = parkingLot.park(new Car(carNumber));
        Car car = parkingLot.find(ticket);
        parkingLot.unPark(ticket);
        car = parkingLot.find(ticket);
        assertNull(car);
    }

}
