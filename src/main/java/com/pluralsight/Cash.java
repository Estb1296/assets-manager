package com.pluralsight;

public class Cash extends Asset {

    public Cash(double originalCost, String description, String dateAcquired) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}
