package com.main;

import com.inventory.*;

public class BookMyStayApp 
{

    public static void main(String[] args) 
    {

        InventoryManager inventory = new InventoryManager();

        inventory.addRoomType("Single",10,2000);
        inventory.addRoomType("Double",6,3500);
        inventory.addRoomType("Suite",3,6000);

        inventory.printInventory();
    }
}