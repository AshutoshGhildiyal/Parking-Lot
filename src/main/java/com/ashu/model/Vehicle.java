package com.ashu.model;

import com.ashu.enums.VehicleType;

public abstract class Vehicle {
    String numnber;
    VehicleType type;

    Vehicle(String numnber, VehicleType vehicleType){
        this.numnber = numnber;
        this.type = vehicleType;
    }
}
