package com.UdemyJava;

import java.util.ArrayList;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Healthy extends Hamburger {
    public boolean kale;
    public boolean cucumber;

    public Healthy(boolean lettuce, boolean cheese, boolean tomato, boolean pickle, boolean kale, boolean cucumber) {
        super("Rye", "Turkey", lettuce, cheese, tomato, pickle);
        this.kale = kale;
        this.cucumber = cucumber;
        baseCost = 2.00;
    }


    @Override
    public ArrayList<String> addOnsSelected() {
        boolean[] healthyTest = {lettuce, cheese, tomato, pickle, kale, cucumber};
        String[] addOns = {"Lettuce", "Cheese", "Tomato", "Pickle", "Kale", "Cucumber"};

        ArrayList<String> healthyAddons = new ArrayList<>();

        for(int i = 0; i < healthyTest.length; i++){
            if (healthyTest[i]){
                healthyAddons.add(addOns[i]);
            }
        }
        System.out.println("Healthy Addons: " + healthyAddons);
        return healthyAddons;
    }

    @Override
    public double addOnCostCalculator() {

        boolean[] healthyTest = {lettuce, cheese, tomato, pickle, kale, cucumber};
        for(boolean val : healthyTest){
            if(val){
                numberOfAddons++;
            }
        }
        //System.out.println("Test Array = " + Arrays.toString(test));
        addOnCost = numberOfAddons * 0.20;
        System.out.println("Your Addon Total is: $" + addOnCost);
        return  addOnCost;

    }

    @Override
    public double basePrice() {
        System.out.println("Base Cost of the Healthy burger: $" + baseCost);
        return baseCost;
    }

    @Override
    public double totalCost() {
        customerTotal = baseCost + addOnCostCalculator();
        System.out.println("Your Total is: $" + customerTotal);
        return customerTotal;
    }
}
