package com.pluralsight;

public class Vehicle extends Asset{
     private final String makeModel ;
     private final int  year ;
     private final int odometer ;

     public Vehicle(String description, String dateAcquired, double originalCost,String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    @Override
    public double getValue() {
        double baseValue = getOriginalCost();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - getYear();

        double value = baseValue;

        if (age <= 3) {
            value -= baseValue * (0.03 * age);
        }
        else if (age <= 6) {
            value -= baseValue * (0.06 * age);
        }
        else if (age <= 10) {
            value -= baseValue * (0.08 * age);
        }
        else {
            value = 1000.00;
        }

        boolean isReliableBrand =
                getMakeModel().toLowerCase().contains("honda") ||
                        getMakeModel().toLowerCase().contains("toyota");

        if (getOdometer() > 100000 && !isReliableBrand) {
            value *= 0.75;
        }

        return value;
    }

    @Override
    public String toString() {
        return "Vehicle : " +
                "makeModel = " + getMakeModel()  +
                ", year = " + getYear() +
                ", odometer = " + getOdometer();
    }
}
