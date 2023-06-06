package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private String name;
    private String description;
    private double price;
    private int taxes;
    private int serialCode;

//    Constructor

    Prodotto(String name, String description, double price, int taxes) {
        this.serialCode = getSerialCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxes = taxes;
    }

    //    Methods
    public double taxedPrice() {
        double priceToAdd = (this.price * this.taxes) / 100;

        return this.price + priceToAdd;
    }

//    Getter Setter

    public int getSerialCode() {

        Random random = new Random();

        serialCode = random.nextInt((99999999 - 10000000) + 1) + 10000000;

        return serialCode;

    }

    public String getFullName() {
        return this.name + "-" + this.serialCode;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getTaxes() {
        return this.taxes;
    }
}
