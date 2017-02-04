package com.UdemyJava;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Additions {
    private String description;
    private int numberOfAdditions;
    private double price;

    public Additions(String description, int numberOfAdditions, double price) {
        this.description = description;
        this.numberOfAdditions = 0;
        this.price = 0.20;
    }


    // Additions counter Needed Here

    public int addOnCounter(int numberOfAdditions){
        numberOfAdditions++;
        if(Hamburger.class.getName() == "Base"){
            numberOfAdditions <=4;
        }else if(Hamburger.class.getName() == "Healthy"){
            numberOfAdditions <=6;
        }else if(Hamburger.class.getName() == "Deluxe"){
            numberOfAdditions = 2;
        }
        return numberOfAdditions;
    }

    public double totalAddOnCost (int numberOfAdditions, double price){
        double addOnCost = numberOfAdditions * price;
        return addOnCost;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public double getPrice() {
        return price;
    }
}
