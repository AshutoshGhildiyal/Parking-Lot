package com.ashu.model;

import com.ashu.enums.VehicleType;

public class TruckSlot extends ParkingSlot{
    public TruckSlot(int slotNumber) {
        super(slotNumber);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.type == VehicleType.Truck;
    }
}
