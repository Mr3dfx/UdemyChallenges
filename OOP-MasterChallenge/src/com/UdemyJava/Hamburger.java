package com.UdemyJava;

import java.util.ArrayList;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Hamburger {
    public String breadType;
    public String meatType;
    public boolean lettuce;
    public boolean cheese;
    public boolean tomato;
    public boolean pickle;
    private int numberOfAddons;
    public double baseCost;
    private double addOnCost;
    public double customerTotal;

    public Hamburger(String breadType, String meatType, boolean lettuce, boolean cheese, boolean tomato, boolean pickle) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.lettuce = lettuce;
        this.cheese = cheese;
        this.tomato = tomato;
        this.pickle = pickle;
        this.numberOfAddons = 0;
        this.baseCost = 1.00;
        this.addOnCost = 0.00;
        this.customerTotal = 0.00;
        }

    public double addOnCostCalculator (){
        boolean[] test = {lettuce, cheese, tomato, pickle};
        for(boolean val : test){
            if(val){
                numberOfAddons++;
            }
        }
        //System.out.println("Test Array = " + Arrays.toString(test));
        addOnCost = numberOfAddons * 0.20;
        System.out.println("Your Addon Total is: $" + addOnCost);
        return  addOnCost;
       }

    public ArrayList<String> addOnsSelected(){
        boolean[] test = {lettuce, cheese, tomato, pickle};
        String[] addOns = {"Lettuce", "Cheese", "Tomato", "Pickle"};
        ArrayList<String> selectedAddOns = new ArrayList<>();
        for(int i = 0; i < test.length; i++){
                if (test[i]){
                    selectedAddOns.add(addOns[i]);
                }
        }
        System.out.println("Added Items: " + selectedAddOns);
        return selectedAddOns;
    }

    public double totalCost (){
        customerTotal = baseCost + addOnCostCalculator();
        System.out.println("Your Total is: $" + customerTotal);
        return customerTotal;
        }

    public String getBreadType() {
        System.out.println("Bread Type: " + breadType);
        return breadType;
    }

    public String getMeatType() {
        System.out.println("Meat Type: " + meatType);
        return meatType;
    }
}
