package com.xworkz.chicken;

public class SmartPhone {

        public String brand;
        public String model;
        public int storageCapacity;
        public int batteryLife;

        public SmartPhone() {
            System.out.println("Constructor of Smartphone Created");
        }

        public void makeCall() {
            System.out.println("Making a call...");
        }

        public void sendText(String message) {
            System.out.println("Sending text: " + message);
        }
    }

