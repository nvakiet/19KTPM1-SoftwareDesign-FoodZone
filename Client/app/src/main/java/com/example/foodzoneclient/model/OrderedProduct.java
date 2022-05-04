package com.example.foodzoneclient.model;

public class OrderedProduct {
    private final String ID;
    private final String name;
    private final String image;
    private final String recipientName;
    private       String state;
    private final String date;
    private final int    amount;
    private final int    price;

    public OrderedProduct(String ID, String name, String image, String recipientName, String state, String date, int amount, int price) {
        this.ID            = ID;
        this.name          = name;
        this.image         = image;
        this.recipientName = recipientName;
        this.state         = state;
        this.date          = date;
        this.amount        = amount;
        this.price         = price;
    }

    public String getDate() {
        return date;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getState() {
        return state;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
}