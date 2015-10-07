package com.thoughtworks.parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private Map<String,Car> parkedCars = new HashMap<>();

    public ParkingTicket park(Car car) {
        parkedCars.put(car.getNumber(), car);
        return new ParkingTicket(car.getNumber());
    }

    public Car find(ParkingTicket ticket) {
        return parkedCars.get(ticket.getNumber());
    }

    public void unPark(ParkingTicket ticket) {
        parkedCars.remove(ticket.getNumber());
    }
}