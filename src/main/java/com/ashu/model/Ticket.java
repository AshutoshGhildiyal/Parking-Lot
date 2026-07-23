package com.ashu.model;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    public ParkingSlot slot;
    public long entryTime;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSlot slot){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = System.currentTimeMillis();
    }
}
