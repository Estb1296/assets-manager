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
        return super.getValue();
    }

    @Override
    public String toString() {
        return "Vehicle : " +
                "makeModel = " + getMakeModel()  +
                ", year = " + getYear() +
                ", odometer = " + getOdometer();
    }
}
