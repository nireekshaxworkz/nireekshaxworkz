package com.xworkz.chicken;

    public class Bull {

        public String breed;
        public int age;
        public double weight;
        public String color;
        public boolean isTrained;

        public Bull() {
            System.out.println("Constructor of Bull Created");
        }

        public void graze() {
            System.out.println("The bull is grazing.");
        }

        public void rest() {
            System.out.println("The bull is resting.");
        }

        public void charge() {
            System.out.println("The bull is charging.");
        }

        public void roar() {
            System.out.println("The bull is roaring.");
        }

        public void walk() {
            System.out.println("The bull is walking.");
        }
    }

