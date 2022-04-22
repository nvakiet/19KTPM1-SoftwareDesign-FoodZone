package com.example.foodzoneclient.model;

public class Restaurant {
    private String ID;
    private int image;
    private String name;
    private String address;

    public Restaurant(String ID, int image, String name, String address) {
        this.ID = ID;
        this.image = image;
        this.name = name;
        this.address = address;
    }

    public Restaurant(int image, String name, String address) {
        this.image = image;
        this.name = name;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}