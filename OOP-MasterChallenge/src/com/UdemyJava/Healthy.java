package com.UdemyJava;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Healthy extends Hamburger {
    public Healthy(String breadType, String meatType, String name) {
        super("Brown Rye", "Turkey", name);
    }

    @Override
    public String name() {
        return "Healthy";
    }

    @Override
    public double price() {
        return 2.00;
    }
}
