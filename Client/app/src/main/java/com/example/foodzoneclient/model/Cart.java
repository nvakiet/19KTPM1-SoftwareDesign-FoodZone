package com.example.foodzoneclient.model;

import java.util.ArrayList;

public class Cart {
    private static Cart cartInstance = null;
    private static ArrayList<Product> productList;
    private static String currentRestaurant = null;

    private Cart() {
        productList = new ArrayList<>();
    }

    public static Cart getCartInstance() {
        if (cartInstance == null) {
            cartInstance = new Cart();
        }

        return cartInstance;
    }

    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public static int size() {
        return productList.size();
    }

    public static Product get(int position) {
        return productList.get(position);
    }

    public static String getCurrentRestaurant() {
        return currentRestaurant;
    }

    public static void setCurrentRestaurant(String id) {
        currentRestaurant = id;
    }

    public static void add(Product product) {
        productList.add(product);
    }

    public static void remove(int position) {
        productList.remove(position);
    }

    public static void clear() {
        productList.clear();
    }
}
