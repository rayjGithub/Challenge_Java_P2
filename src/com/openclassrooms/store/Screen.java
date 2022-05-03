package com.openclassrooms.store;

/** Classe de l'item Screen:
 * hérite de la classe Item.
 * @author Ray
 */
public class Screen extends Item{

    public String resolution;

    public Screen(Brand brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Spécialisation de la methode toString pour la classe Screen
    public String toString() {
        return "Screen [brand=" + brand + ", price=" + price + ", resolution=" + resolution + "]";
    }

}
