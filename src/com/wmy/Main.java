package com.wmy;

import com.wmy.Creature.*;
import com.wmy.Transportation.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person Tom = new Person();
        Tom.person("01150","Tom","18","man");
        Automobile TomCar = new Automobile(){
            @Override
            public void addGas(String oilType, String number) {

            }

            @Override
            public void drivingMethod() {
            }
            @Override
            public void addGas() {
            }
        };
        TomCar.drivingMethod("John","北纬63.3*，西经100*","150元","2020.1.1","010-7458");


        Person Chloe = new Person();
        Chloe.person("02541","Chloe","20","female");
        Aircraft ChloeAircraft = new Aircraft(){
            @Override
            public void addGas(String oilType, String number) {

            }

            @Override
            public void drivingMethod() {
            }
            @Override
            public void addGas() {
            }
        };
        ChloeAircraft.drivingMethod("John","北纬32.2*，东经100*","10000元","2020.4.9","010-7458");
    }
}
