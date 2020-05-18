package com.wmy.Transportation;

public abstract class Bicycle extends LandTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "LAND_Bicycle";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("Riding a bike is very leisurely.");
        System.out.println("*****************************");
    }
    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }

    @Override
    public void addGas() {

    }
}