package com.ashu.strategy.pricing;

import com.ashu.model.Ticket;

public class CarPricingStrategy implements PricingStrategy {
    @Override
    public double calculateFare(Ticket ticket) {
        long hours = (System.currentTimeMillis() - ticket.entryTime) / (1000 * 60 * 60 );
        return Math.max(hours,1) * 100 ;
    }
}
