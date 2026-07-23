package com.ashu.strategy.pricing;

import com.ashu.model.Ticket;

public interface PricingStrategy {
    double calculateFare(Ticket ticket);
}

/*
Need for Strategy pattern here ?

WeekendPricing
VIP pricing
EV pricing


 */
