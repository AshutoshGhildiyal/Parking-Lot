package com.ashu.model;

import com.ashu.enums.VehicleType;

public class Bike extends Vehicle{
    Bike(String numnber, VehicleType vehicleType) {
        super(numnber, VehicleType.Bike);
    }
}
