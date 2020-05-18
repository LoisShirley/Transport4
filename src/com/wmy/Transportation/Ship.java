package com.wmy.Transportation;

public abstract class Ship extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "SEA_Ship";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("The sea wind is a little salty.");
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