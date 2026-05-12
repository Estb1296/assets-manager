package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset>assets=new ArrayList<>();
        assets.add(new House("Ranch",
                "01-12-2026",
                200000,
                "2118 Sam Houston St",
                3,
                500,
                100));
        assets.add(new House( "Beach House",
                "05-12-2026",
                850000,
                "1280 Ocean Front Walk, Santa Monica, CA",
                4,
                2800,
                5200));
        assets.add(new Vehicle("Heavy Duty Work Truck",
                "02-14-2025",
                65000,
                "Ford F-150 Raptor",
                2024,
                18500));
        assets.add(new Vehicle("Convertible Beach Cruiser",
                "06-01-2025",
                78000,
                "Porsche 911 Cabriolet",
                2025,
                4200));
        assets.add(new Asset("BeachHouse", "01-03-2026",300000));
        for (Asset asset : assets) {
            System.out.println(asset);
        }
        String message = " ";

        for (Asset asset : assets) {
            if (asset instanceof House house) {

                message = "House at " + house.getAddress();

            } else if (asset instanceof Vehicle vehicle) {

                message = "Vehicle: " +
                        vehicle.getYear() +
                        " " +
                        vehicle.getMakeModel();
            }

            System.out.println(message);

            }
        System.out.println("...............................");
        for(Asset asset:assets){
            double value = asset.getValue();

        if (value > 150000) {
            System.out.println("HIGH VALUE ASSET:");
            System.out.println(assets);
            System.out.println("Value: " + asset.getValue());
        }
        else if(value <100000){
            System.out.println("LOW VALUE ASSET:");
            System.out.println(assets);
            System.out.println("Value: "+asset.getValue());
        }
        }
        }
    }
