package com.ashu.factory;

import com.ashu.enums.VehicleType;
import com.ashu.model.*;

public class SlotFactory {

    ParkingSlot createSlot(VehicleType type, int slotNumber ){

        switch (type){

            case Car -> {
                return new CarSlot(slotNumber);
            }

            case Bike ->{
                return new BikeSlot(slotNumber);
            }

            case Truck -> {
                return new TruckSlot(slotNumber);
            }

            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
