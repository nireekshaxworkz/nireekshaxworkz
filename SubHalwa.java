package com.xworkz.chicken;
    public class SubHalwa extends Halwa{
        public SubHalwa() {
            System.out.println("SubHalwa constructor created");
        }

        public static void main(String[] args) {
            SubHalwa subHalwa1 = new SubHalwa();
            subHalwa1.color = "white";
            System.out.println("color =" + subHalwa1.color);
            subHalwa1.type= "coconut";
            System.out.println("TYpe =" + subHalwa1.type);

            subHalwa1.buys();
            subHalwa1.sell();


        }
    }

