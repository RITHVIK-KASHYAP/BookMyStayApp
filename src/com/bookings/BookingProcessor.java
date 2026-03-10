package com.bookings;
import java.util.*;

import com.inventory.*;

public class BookingProcessor {

    private InventoryManager inventory;

    private HashSet<String> bookedRoomIds = new HashSet<>();

    private HashMap<String, Set<String>> allocatedRooms = new HashMap<>();

    private int roomCounter = 1;

    public BookingProcessor(InventoryManager inventory){
        this.inventory = inventory;
    }

    public void confirmReservation(Reservation reservation){

        String type = reservation.getRoomType();

        int available = inventory.getAvailableRooms(type);

        if(available <= 0){
            System.out.println("No rooms available for " + type);
            return;
        }

        String roomId = type.substring(0,1).toUpperCase() + roomCounter++;

        bookedRoomIds.add(roomId);

        allocatedRooms.putIfAbsent(type,new HashSet<>());
        allocatedRooms.get(type).add(roomId);

        inventory.updateRoomCount(type,available-1);

        System.out.println(
                "Reservation Confirmed | Guest: "
                        + reservation.getGuestName()
                        + " | RoomID: " + roomId
        );
    }
}
