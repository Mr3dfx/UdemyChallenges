package com.UdemyJava;


public class Main {

    public static void main(String[] args) {

//    Hamburger alpha = new Hamburger("White", "Beef", true,true,true,true);
//    alpha.totalCost();
//        System.out.println("\n");
//
//    Hamburger beta = new Hamburger("White", "Beef", true,false,false,false);
//    beta.totalCost();
//        System.out.println("\n");
//
//    Hamburger gamma = new Hamburger("White", "Beef", true,false,true,false);
//    gamma.totalCost();
//        System.out.println("\n");
//
    Hamburger kappa = new Hamburger("White", "Beef", true,false,true,false);
    kappa.getMeatType();
    kappa.getBreadType();
    kappa.totalCost();
    kappa.addOnsSelected();
        System.out.println("\n");


    Hamburger gamma = new Hamburger("Whole Wheat","Buffalo", true,true, false, true);
    gamma.getBreadType();
    gamma.getMeatType();
    gamma.addOnsSelected();
    gamma.totalCost();
        System.out.println("\n");


    Hamburger theta = new Deluxe("Kazier", "Lobster");
    theta.getBreadType();
    theta.getMeatType();
    theta.addOnsSelected();
    theta.totalCost();



    }

}
