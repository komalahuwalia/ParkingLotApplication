package com.thoughtworks.parkinglot;

/**
 * Created by komal on 07/10/15.
 */
public class ParkingTicket {
    private String carNumber;

    public ParkingTicket(String carNumber) {

        this.carNumber = carNumber;
    }

    public String getNumber() {
        return carNumber;
    }
}
