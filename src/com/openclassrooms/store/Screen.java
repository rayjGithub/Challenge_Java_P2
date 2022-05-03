package com.openclassrooms.store;

public class Screen extends Item{

    public String resolution;

    public Screen(Brand brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
    }

    // Spécialisation de la methode toString pour la classe Screen
    public String toString() {
        return "Screen [brand=" + brand + ", price=" + price + ", resolution=" + resolution + "]";
    }

}
