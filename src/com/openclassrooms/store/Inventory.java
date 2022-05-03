package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    Map<Item,Integer> items = new HashMap<Item,Integer>();

    public void addItem(Item item, int quantity) {
        items.put(item, quantity);
    }

    public void removeItem(Item item, int quantity) {
        int value = items.get(item);
        value = value - quantity;
        
        if(value < 0) value = 0;
        items.put(item, value);
    }

    public void displayItemsOnConsole() {
        for(Map.Entry<Item,Integer> item : items.entrySet()) {
            System.out.println(item.getKey());
        }
    }

    public void displayInventoryOnConsole() {
        for(Map.Entry<Item, Integer> item : items.entrySet()) {
            System.out.println("Item: " + item.getKey() + "-> " + item.getValue());
        }
    }

}
