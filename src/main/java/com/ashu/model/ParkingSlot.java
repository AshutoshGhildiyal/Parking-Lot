package com.ashu.model;

public abstract class ParkingSlot {
   public int slotNumber;
    public boolean occupied;
    public Vehicle vehicle;

    ParkingSlot(int slotNumber){
        this.slotNumber = slotNumber;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);
}
