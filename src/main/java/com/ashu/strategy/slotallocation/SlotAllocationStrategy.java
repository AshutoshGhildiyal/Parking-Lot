package com.ashu.strategy.slotallocation;

import com.ashu.model.ParkingFloor;
import com.ashu.model.ParkingSlot;
import com.ashu.model.Vehicle;

import java.util.List;

public interface SlotAllocationStrategy {
    ParkingSlot allocate(List<ParkingFloor> floors , Vehicle vehicle);
}


/*

Nearest Gate Strategy
VIP Slot Strategy
Handicap Priority

*/