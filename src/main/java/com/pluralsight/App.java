package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset>asset=new ArrayList<>();
        asset.add(new House("Ranch",
                "01-12-2026",
                200000,
                "2118 Sam Houston St",
                3,
                500,
                100));
        asset.add(new House( "Beach House",
                "05-12-2026",
                850000,
                "1280 Ocean Front Walk, Santa Monica, CA",
                4,
                2800,
                5200));
        asset.add(new Vehicle("Heavy Duty Work Truck",
                "02-14-2025",
                65000,
                "Ford F-150 Raptor",
                2024,
                18500));
        asset.add(new Vehicle("Convertible Beach Cruiser",
                "06-01-2025",
                78000,
                "Porsche 911 Cabriolet",
                2025,
                4200));
        asset.add(new Asset("BeachHouse", "01-03-2026",300000));
        for (Asset assets : asset) {
            System.out.println(assets);
        }
        String message = " ";

        for (Asset assets : asset) {
            if (assets instanceof House house) {

                message = "House at " + house.getAddress();

            } else if (assets instanceof Vehicle vehicle) {

                message = "Vehicle: " +
                        vehicle.getYear() +
                        " " +
                        vehicle.getMakeModel();
            }

            System.out.println(message);

            }
        System.out.println("...............................");
        for(Asset assets:asset){
            double value = assets.getValue();

        if (value > 150000) {
            System.out.println("HIGH VALUE ASSET:");
            System.out.println(assets);
            System.out.println("Value: " + assets.getValue());
        }
        else if(value <100000){
            System.out.println("LOW VALUE ASSET:");
            System.out.println(assets);
            System.out.println("Value: "+assets.getValue());
        }
        }
        }


    }
