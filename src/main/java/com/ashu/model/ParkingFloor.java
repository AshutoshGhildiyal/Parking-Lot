package com.ashu.model;

import java.util.List;

public class ParkingFloor {
    public int floorNumber;
    public List<ParkingSlot> slots;

    public ParkingFloor(int floorNumber, List<ParkingSlot> slots){
        this.floorNumber = floorNumber;
        this.slots = slots;
    }
}
