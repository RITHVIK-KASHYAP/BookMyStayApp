package com.main;

import com.inventory.*;
import com.search.*;
import com.bookings.*;
import com.services.*;

public class BookMyStayApp 
{

    public static void main(String[] args) 
    {

        ServiceManager manager = new ServiceManager();

        manager.addService("R1",new AddOnService("Breakfast",500));
        manager.addService("R1",new AddOnService("Airport Pickup",1200));
        manager.addService("R1",new AddOnService("Spa",2000));

        manager.printServices("R1");
    }
}

