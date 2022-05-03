package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;

/** Classe inventaire qui répertorie tous les items.
 * Elle permet aussi d'effectuer différentes action sur l'inventaire des items
 * @author Ray
 */
public class Inventory {

    /** 
     * Collection sur l'iventaire des différents items et leurs quantités
     */
    private Map<Item,Integer> items = new HashMap<Item,Integer>();

    /** 
     * permet la création d'un nouvelle inventaire
     */
    public Inventory() {}
    /** 
     * Permet de rajouter un inventaire existant à cet inventaire
     * @param existingItems inventaire à rajouter à celui-ci
     */
    public Inventory(Map<Item, Integer> existingItems) {
        items.putAll(existingItems);// Ajoute à l'inventaire existant les nouvelles données
    }

    /** 
     * permet d'ajouter un item et sa quantité dans l'inventaire
     * @param item correspond à l'item
     * @param quantity correspond à la quatité à ajouter de cette item
     */
    public void addItem(Item item, int quantity) {
        if(items.containsKey(item)) {// containsKey() permet de verifier si l'item passé en paramètre de la methode existe déjà dans la Map
            quantity = items.get(item) + quantity;
        }
        items.put(item, quantity);
    }

    /** 
     * Permet de retirer une quantité d'un item dans l'iventaire
     * @param item correspond à l'item auquel on retire une quantité
     * @param quantity correspond à la quantité à retirer de l'item
     */
    public void removeItem(Item item, int quantity) {
        if(items.containsKey(item)) {
            int existingQuantity = items.get(item);
            int newQuantity = existingQuantity - quantity;
        
            if(newQuantity < 0) newQuantity = 0;
            items.put(item, newQuantity);
        }
    }

    /** 
     * Affiche dans la console la liste des items
     * Display on the console items without quantity
     */
    public void displayItemsOnConsole() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Items' List");
        System.out.println("----------------------------------------------------------------------");
        // for(Map.Entry<Item,Integer> item : items.entrySet()) {
        //     System.out.println(item.getKey());
        // }
        // OU
        // Using lambdas
        items.forEach((item, quantity) -> System.out.println((item)));
        System.out.println();
    }
    /** 
     * Affiche l'inventaire dans la console: chaque item et sa quantité associée
     * Display on the console items and quantity.
     * Format [Class Name - Brand - Quantity]
     */
    public void displayInventoryOnConsole() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Inventory");
        System.out.println("----------------------------------------------------------------------");
        // for(Map.Entry<Item, Integer> item : items.entrySet()) {
        //     System.out.println("Item: " + item.getKey() + " -> " + item.getValue());
        // }
        // OU
        // Using lambdas
        /**
         * La methode forEach de Map nous permet grace à la fonction anonyme de lister les items de la Map
         * getClass() permet de recupérer le nom de la class à traver son lien d'importation. ici: "class com.openclassrooms.store.Mouse par exemple"
         * getSimpleName() Combiner avec getClass(), nous permet de récupérer le nom de la classe tel qu'il est ecrit dans le code source
         */
        items.forEach((item, quantity) -> System.out.println((item.getClass().getSimpleName() + " - " + item.getBrand() + ":" + quantity)));
        System.out.println();
    }

}
