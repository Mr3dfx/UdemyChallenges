package com.UdemyJava;


public class Main {

    public static void main(String[] args) {

    Hamburger kappa = new Hamburger("White", "Beef", true,false,true,false);
    kappa.basePrice();
    kappa.getMeatType();
    kappa.getBreadType();
    kappa.addOnsSelected();
    kappa.totalCost();

        System.out.println("\n");


    Hamburger gamma = new Hamburger("Whole Wheat","Buffalo", true,true, false, true);
    gamma.basePrice();
    gamma.getBreadType();
    gamma.getMeatType();
    gamma.addOnsSelected();
    gamma.totalCost();
        System.out.println("\n");


    Hamburger theta = new Deluxe("Kazier", "Lobster");
    theta.basePrice();
    theta.getBreadType();
    theta.getMeatType();
    theta.addOnsSelected();
    theta.totalCost();
        System.out.println("\n");

    Hamburger zeta = new Healthy(true,true,true,true,true,true);
    zeta.basePrice();
    zeta.getMeatType();
    zeta.getBreadType();
    zeta.addOnsSelected();
    zeta.totalCost();
        System.out.println("\n");

    Hamburger omega = new Healthy(false, false, true, true, false, true);
    omega.basePrice();
    omega.getMeatType();
    omega.getBreadType();
    omega.addOnsSelected();
    omega.totalCost();
    }

}
