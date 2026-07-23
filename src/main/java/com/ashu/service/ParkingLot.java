package com.ashu.service;

import com.ashu.model.ParkingFloor;
import com.ashu.model.ParkingSlot;
import com.ashu.model.Ticket;
import com.ashu.model.Vehicle;
import com.ashu.strategy.pricing.PricingStrategy;
import com.ashu.strategy.slotallocation.FirstAvailableStrategy;
import com.ashu.strategy.slotallocation.SlotAllocationStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {

    private static ParkingLot instance;

    public List<ParkingFloor> floors;
    public SlotAllocationStrategy allocationStrategy;

    private ParkingLot(){
        floors = new ArrayList<>();
        allocationStrategy = new FirstAvailableStrategy();
    }

    public static ParkingLot getInstance(){
        if (instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }


    public synchronized Ticket parkVehicle(Vehicle vehicle){

        ParkingSlot slot = allocationStrategy.allocate(floors, vehicle);

        if (slot == null ) return null ;

        slot.occupied = true;
        slot.vehicle = vehicle;

        return new Ticket(UUID.randomUUID().toString(), vehicle , slot );

    }

    public double unParkVehicle(Ticket ticket, PricingStrategy strategy ){

        ParkingSlot slot = ticket.slot;

        slot.occupied = false;
        slot.vehicle = null;

        return strategy.calculateFare(ticket);
    }
}
