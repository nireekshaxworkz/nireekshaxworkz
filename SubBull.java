package com.xworkz.chicken;
    public class SubBull extends Bull {

        public SubBull() {
            System.out.println("SubBull constructor created");
        }

        public static void main(String[] args) {
            SubBull subBull = new SubBull();

            subBull.breed = "Angus";
            subBull.age = 5; // in years
            subBull.weight = 1500.0; // in kg
            subBull.color = "Black";
            subBull.isTrained = true;

            System.out.println("Breed: " + subBull.breed);
            System.out.println("Age: " + subBull.age + " years");
            System.out.println("Weight: " + subBull.weight + " kg");
            System.out.println("Color: " + subBull.color);
            System.out.println("Trained: " + (subBull.isTrained ? "Yes" : "No"));

            subBull.graze();
            subBull.rest();
            subBull.charge();
            subBull.roar();
            subBull.walk();
        }
    }
