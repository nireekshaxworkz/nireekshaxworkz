package com.xworkz.chicken;
    public class SubSmartphone extends SmartPhone {

        public SubSmartphone() {
            System.out.println("SubSmartphone constructor created");
        }

        public static void main(String[] args) {
            SubSmartphone subSmartphone = new SubSmartphone();

            subSmartphone.brand = "Apple";
            subSmartphone.model = "iPhone 14";
            subSmartphone.storageCapacity = 256; // in GB
            subSmartphone.batteryLife = 20; // in hours

            System.out.println("Brand: " + subSmartphone.brand);
            System.out.println("Model: " + subSmartphone.model);
            System.out.println("Storage Capacity: " + subSmartphone.storageCapacity + "GB");
            System.out.println("Battery Life: " + subSmartphone.batteryLife + " hours");

            subSmartphone.makeCall();
            subSmartphone.sendText("Hello from my new iPhone!");
        }
    }

