package com.ashu.model;

import com.ashu.enums.VehicleType;

public class Truck extends Vehicle{
    Truck(String numnber, VehicleType vehicleType) {
        super(numnber, VehicleType.Truck);
    }
}
