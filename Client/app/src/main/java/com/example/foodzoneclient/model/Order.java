package com.example.foodzoneclient.model;

public class Order {
    private final String date;
    private final String desc;
    private       String state;
    private final String recipientName;
    private final int    price;

    public Order(String date, String desc, String state, String recipientName, int price) {
        this.date          = date;
        this.desc          = desc;
        this.state         = state;
        this.recipientName = recipientName;
        this.price         = price;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public String getState() {
        return state;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public int getPrice() {
        return price;
    }
}