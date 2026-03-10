package com.bookings;

import java.util.LinkedList;
import java.util.Queue;

public class BookingQueue {

    private Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation reservation){
        queue.offer(reservation);
    }

    public Reservation nextRequest(){
        return queue.poll();
    }

    public boolean hasRequests(){
        return !queue.isEmpty();
    }
}