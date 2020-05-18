package com.wmy.Transportation;

public abstract class MaritimeMeansOfTransport extends Transport {

    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        super.drivingMethod(ownership, GPSPosition, price, id, type);
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
