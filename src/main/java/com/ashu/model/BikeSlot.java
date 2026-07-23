package com.ashu.model;

import com.ashu.enums.VehicleType;

public class BikeSlot extends ParkingSlot{
    public BikeSlot(int slotNumber) {
        super(slotNumber);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.type == VehicleType.Bike;
    }
}
