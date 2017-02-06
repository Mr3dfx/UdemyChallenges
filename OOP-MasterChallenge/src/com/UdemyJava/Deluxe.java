package com.UdemyJava;

import java.util.ArrayList;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Deluxe extends Hamburger {
     public boolean chips;
     public boolean drink;


    public Deluxe(String breadType, String meatType) {
        super(breadType, meatType, false,false,false,false);
        this.chips = true;
        this.drink = true;
    }

    @Override
    public ArrayList<String> addOnsSelected() {
        ArrayList<String> deluxeAddons = new ArrayList<>();
        deluxeAddons.add("Drink");
        deluxeAddons.add("Chips");
        System.out.println("Deluxe Addons: " + deluxeAddons);
        return deluxeAddons;
    }

    @Override
    public double totalCost() {
        customerTotal = 3.00;
        System.out.println("Your Total from Deluxe is: $" + customerTotal);
        return customerTotal;
    }
}
