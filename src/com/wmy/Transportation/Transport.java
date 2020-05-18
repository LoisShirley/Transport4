package com.wmy.Transportation;
    public abstract class Transport {
        public Transport() {
        }

        public abstract void drivingMethod();
        public void drivingMethod(String ownership, String GPSPosition, String price,String dateOfPurchase, String id){

            System.out.println("驾驶员："+ownership);
            System.out.println("地理位置："+GPSPosition);
            System.out.println("票价："+price);
            System.out.println("交易日期："+dateOfPurchase);
            System.out.println("该车编号："+id);

        }

        public abstract void load();//装载物品的方法

        public abstract void maintain();//维修的方法

        public abstract void addGas();//加油的方法

        public abstract void addGas(String oilType, String number);
    }


