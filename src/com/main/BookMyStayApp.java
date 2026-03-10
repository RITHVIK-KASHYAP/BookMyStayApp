package com.main;

import com.inventory.*;
import com.search.*;
import com.bookings.*;

public class BookMyStayApp 
{

    public static void main(String[] args) 
    {

        BookingQueue queue = new BookingQueue();

        queue.addRequest(new Reservation("R1","Alice","Single"));
        queue.addRequest(new Reservation("R2","Bob","Suite"));
        queue.addRequest(new Reservation("R3","Charlie","Double"));

        while(queue.hasRequests()){

            Reservation r = queue.nextRequest();

            System.out.println(
                    "Processing booking request for "
                            + r.getGuestName()
                            + " | Room: "
                            + r.getRoomType()
            );
        }
    }
}