package com.openclassrooms.store;

/** Classe de l'item Mouse:
 * hérite de la classe Item.
 * @author Ray
 */
public class Mouse extends Item{

    public Mouse(Brand brand, double price) {
        super(brand, price);// Appelle le constructeur de la class mère
    }

    // Spécialisation de la methode toString pour la classe Mouse
    @Override
    public String toString() {
        return "Mouse [brand=" + brand + ", price=" + price + "]";
    }

}
