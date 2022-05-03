package com.openclassrooms.store;

/** Classe mère de tous les items qui doivent être gérer dans l'inventaire.
 * @author Ray
 */
public abstract class Item {
    
    protected Brand brand;
    protected double price;

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
