package com.ashu.model;

import com.ashu.enums.VehicleType;

public class Car extends Vehicle{
    public Car(String numnber) {
        super(numnber, VehicleType.Car);
    }
}
