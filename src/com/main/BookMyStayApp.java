package com.main;

import com.inventory.*;
import com.search.*;
import com.bookings.*;
import com.services.*;
import com.report.*;

public class BookMyStayApp 
{
    public static void main(String[] args) {

        BookingReport report = new BookingReport();

        report.addReservation(new Reservation("R1","Rithvik","Single"));
        report.addReservation(new Reservation("R2","Rishab","Suite"));
        report.addReservation(new Reservation("R3","Ghouse","Double"));

        report.printHistory();
    }
}