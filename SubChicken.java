package com.xworkz.chicken;

    public class SubChicken extends Chicken {

        public SubChicken() {
            System.out.println("SubChicken constructor created");
        }

        public static void main(String[] args) {
            SubChicken subChicken = new SubChicken();

            subChicken.breed = "Leghorn";
            subChicken.age = 2; // in years
            subChicken.weight = 2.5; // in kg
            subChicken.color = "White";
            subChicken.isLayingEggs = true;
            subChicken.gender = "Female";
            subChicken.habitat = "Farm";
            subChicken.isVaccinated = true;
            subChicken.diet = "Grains";
            subChicken.name = "Clucky";

            System.out.println("Breed: " + subChicken.breed);
            System.out.println("Age: " + subChicken.age + " years");
            System.out.println("Weight: " + subChicken.weight + " kg");
            System.out.println("Color: " + subChicken.color);
            System.out.println("Laying Eggs: " + (subChicken.isLayingEggs ? "Yes" : "No"));
            System.out.println("Gender: " + subChicken.gender);
            System.out.println("Habitat: " + subChicken.habitat);
            System.out.println("Vaccinated: " + (subChicken.isVaccinated ? "Yes" : "No"));
            System.out.println("Diet: " + subChicken.diet);
            System.out.println("Name: " + subChicken.name);

            subChicken.cluck();
            subChicken.layEgg();
            subChicken.forage();
            subChicken.sleep();
            subChicken.walk();
        }
    }

