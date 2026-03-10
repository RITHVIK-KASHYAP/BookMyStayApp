package com.search;


import com.inventory.*;
import java.util.HashMap;

public class RoomSearch {

    private InventoryManager inventory;

    public RoomSearch(InventoryManager inventory) {
        this.inventory = inventory;
    }

    public void searchAvailableRooms(){

        HashMap<String,Integer> counts = inventory.getRoomCounts();
        HashMap<String,Double> prices = inventory.getRoomPrices();

        System.out.println("\nAvailable Rooms");

        for(String type : counts.keySet()){

            int available = counts.get(type);

            if(available > 0){

                System.out.println(
                        type +
                        " | Available: " + available +
                        " | Price: " + prices.get(type)
                );
            }
        }
    }
}
