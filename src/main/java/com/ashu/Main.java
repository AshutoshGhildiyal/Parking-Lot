package com.ashu;

import com.ashu.model.*;
import com.ashu.service.ParkingLot;
import com.ashu.strategy.pricing.CarPricingStrategy;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ParkingLot lot = ParkingLot.getInstance();

        List<ParkingSlot> slots = new ArrayList<>();
        slots.add(new CarSlot(1));
        slots.add(new CarSlot(2));

        ParkingFloor floor1 = new ParkingFloor( 1, slots );
        lot.floors.add(floor1);



        Vehicle car = new Car("UP14FY6298");

        Ticket ticket = lot.parkVehicle(car);

        double price = lot.unParkVehicle(ticket, new CarPricingStrategy() );

        System.out.println(price);
    }
}