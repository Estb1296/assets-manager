package com.pluralsight;


public class House extends Asset {
    private final String address;
    private final int condition;
    private final int squareFoot;
    private final int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public int getCondition() {
        if (condition <= 4 && condition >= 1) {
            return condition;
        } else {
            message();
            return 0;
        }
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSqFt;
        switch (getCondition()) {
            case 4 -> pricePerSqFt = 180.00;
            case 3 -> pricePerSqFt = 130.00;
            case 2 -> pricePerSqFt = 90.00;
            case 1 -> pricePerSqFt = 80.00;
            default -> pricePerSqFt = 0;
        }
        double houseValue = getSquareFoot() * pricePerSqFt;

        double lotValue = getLotSize() * 0.25;

        return houseValue + lotValue;
    }

    public void message() {
        System.out.println("Invalid input");
    }

    @Override
    public String toString() {
        return "House: " +
                "address = " + getAddress() +
                ", condition = " + getCondition() +
                ", squareFoot = " + getSquareFoot() +
                ", lotSize = " + getLotSize();
    }
}
