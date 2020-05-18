package com.wmy.Transportation;

public abstract class Train extends LandTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "LAND_Train";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("Kuang Chi~~Kuang Chi~~Kuang Chi~~");
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
