package com.wmy.Transportation;

public abstract class Hovercraft extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "SEA_Hovercraft";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("The sea is beautiful.");
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