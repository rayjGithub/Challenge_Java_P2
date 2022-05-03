package com.openclassrooms;

import com.openclassrooms.store.Brand;
import com.openclassrooms.store.Inventory;
import com.openclassrooms.store.Mouse;
import com.openclassrooms.store.Screen;

/** 
 * Début du programme: classe applicative
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("INVENTORY POC");

        Mouse delMouse = new Mouse(Brand.DELL, 20.0);
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x10800");

        Inventory inventory = new Inventory();
        inventory.addItem(samsungScreen, 5);

        inventory.addItem(delMouse, 12);
        inventory.removeItem(delMouse, 2);
        inventory.displayInventoryOnConsole();

        inventory.removeItem(delMouse, 12);

        inventory.displayInventoryOnConsole();
        inventory.displayItemsOnConsole();

    }
}
