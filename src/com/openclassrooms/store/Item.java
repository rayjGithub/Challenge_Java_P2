package com.openclassrooms.store;

public class Item {
    
    Brand brand;
    public double price;

    public Item(Brand brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Item [brand=" + brand + ", price=" + price + "]";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
}
