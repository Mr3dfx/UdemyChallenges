package com.UdemyJava;

/**
 * Created by Mr3dfx on 2/3/2017.
 */
public class Hamburger {
    public String breadType;
    public String meatType;
//    public class Additions;
    public String name;


    public Hamburger(String breadType, String meatType, String name) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.name = name;
    }

    public String name(){
        return "Base";
    }

    public double price(){
        return 1.00;
    }

    public String getName() {
        return name;
    }
}
