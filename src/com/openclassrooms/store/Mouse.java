package com.openclassrooms.store;

public class Mouse extends Item{

    public Mouse(Brand brand, double price) {
        super(brand, price);// call from the Item class' constructor
    }

    // Spécialisation de la methode toString pour la classe Mouse
    public String toString() {
        return "Mouse [brand=" + brand + ", price=" + price + "]";
    }

}
