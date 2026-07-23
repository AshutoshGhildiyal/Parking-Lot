package com.ashu.strategy.slotallocation;

import com.ashu.model.ParkingFloor;
import com.ashu.model.ParkingSlot;
import com.ashu.model.Ticket;
import com.ashu.model.Vehicle;
import com.ashu.strategy.pricing.PricingStrategy;

import java.util.List;

public class FirstAvailableStrategy implements SlotAllocationStrategy {


    @Override
    public ParkingSlot allocate(List<ParkingFloor> floors, Vehicle vehicle) {

        for (ParkingFloor floor : floors ){
            for (ParkingSlot slot: floor.slots ){

                if(!slot.occupied && slot.canFitVehicle(vehicle)){
                    return  slot;
                }
            }
        }
        return null;
    }
}
