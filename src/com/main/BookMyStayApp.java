package com.main;

import com.inventory.*;
import com.search.*;
import com.bookings.*;

public class BookMyStayApp 
{

    public static void main(String[] args) {

        InventoryManager inventory = new InventoryManager();

        inventory.addRoomType("Single",2,2000);
        inventory.addRoomType("Suite",1,6000);

        BookingQueue queue = new BookingQueue();

        queue.addRequest(new Reservation("R1","Rithvik","Single"));
        queue.addRequest(new Reservation("R2","Rishab","Suite"));
        queue.addRequest(new Reservation("R3","Ghouse","Suite"));

        BookingProcessor processor = new BookingProcessor(inventory);

        while(queue.hasRequests()){

            processor.confirmReservation(queue.nextRequest());
        }

        inventory.printInventory();
    }
}
