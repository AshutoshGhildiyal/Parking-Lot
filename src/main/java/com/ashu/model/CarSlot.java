package com.ashu.model;

import com.ashu.enums.VehicleType;

public class CarSlot extends ParkingSlot {
    public CarSlot(int slotNumber) {
        super(slotNumber);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.type == VehicleType.Car ;
    }
}
