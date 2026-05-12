package com.pluralsight;


public class House extends Asset{
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
        if(condition<=4&&condition>=1){
            return condition;
        }else{
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
        double value = super.getValue();

        if (value > 1500000) {
            return value;
        } else {
            return getOriginalCost(); // or return value depending on your requirement
        }
    }
    public void message(){
        System.out.println("Invalid input");
    }
    @Override
    public String toString() {
        return "House: " +
                "address = " + getAddress() +
                ", condition = " + getCondition() +
                ", squareFoot = " +getSquareFoot() +
                ", lotSize = " + getLotSize();
    }
}
