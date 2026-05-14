package com.pluralsight;

public abstract class Asset {
    private final String description;
    private final String dataAcquired;
    private final double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dataAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public String getDataAcquired() {
        return dataAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public abstract double getValue();

    @Override
    public String toString() {
        return "Asset: " +
                "description = " + getDescription() +
                ", dataAcquired = " + getDataAcquired() +
                ", originalCost=" + getOriginalCost();
    }
}
