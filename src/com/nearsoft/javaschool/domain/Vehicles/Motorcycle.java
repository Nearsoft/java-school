package com.nearsoft.javaschool.domain.Vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        super(2, "UNDEFINED");
    }

    @Override
    public float getHourPrice() {
        return 10;
    }
}