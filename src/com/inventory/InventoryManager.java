package com.inventory;

import java.util.HashMap;

public class InventoryManager {

    private HashMap<String, Integer> roomCounts = new HashMap<>();
    private HashMap<String, Double> roomPrices = new HashMap<>();

    public void addRoomType(String type, int count, double price) {
        roomCounts.put(type, count);
        roomPrices.put(type, price);
    }

    public void updateRoomCount(String type, int count) {
        roomCounts.put(type, count);
    }

    public void updateRoomPrice(String type, double price) {
        roomPrices.put(type, price);
    }

    public int getAvailableRooms(String type) {
        return roomCounts.getOrDefault(type, 0);
    }

    public double getPrice(String type) {
        return roomPrices.getOrDefault(type, 0.0);
    }

    public HashMap<String,Integer> getRoomCounts(){
        return roomCounts;
    }

    public HashMap<String,Double> getRoomPrices(){
        return roomPrices;
    }

    public void printInventory(){

        System.out.println("\nRoom Inventory");

        for(String type : roomCounts.keySet()){

            System.out.println(
                    type +
                    " | Count: " + roomCounts.get(type) +
                    " | Price: " + roomPrices.get(type)
            );
        }
    }
}