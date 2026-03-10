package com.report;

import com.bookings.Reservation;
import java.util.ArrayList;
import java.util.List;

public class BookingReport {

    private List<Reservation> history = new ArrayList<>();

    public void addReservation(Reservation reservation){
        history.add(reservation);
    }

    public void printHistory(){

        System.out.println("\nBooking History");

        for(Reservation r : history){

            System.out.println(
                    r.getReservationId() +
                    " | " +
                    r.getGuestName() +
                    " | " +
                    r.getRoomType()
            );
        }
    }
}