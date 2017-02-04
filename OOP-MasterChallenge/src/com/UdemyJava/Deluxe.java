package com.UdemyJava;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Deluxe extends Hamburger {
        public boolean drink;
        public boolean chips;

    public Deluxe(String breadType, String meatType, double price, String name, boolean drink, boolean chips) {
        super(breadType, meatType, price,name);
        this.drink = drink;
        this.chips = chips;
    }



}
