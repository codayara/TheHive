package com.mayarafelix.thehive.models;

/**
 * Created by mayca on 10/8/2018.
 */

public class Item {

    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getQuantityDescription() {
        return Integer.toString(quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public void decreaseQuantity() {
        if (quantity > 0) {
            this.quantity--;
        }
    }
}
