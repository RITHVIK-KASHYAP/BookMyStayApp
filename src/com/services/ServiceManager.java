package com.services;

import java.util.*;

public class ServiceManager {

    private Map<String, List<AddOnService>> reservationServices = new HashMap<>();

    public void addService(String reservationId, AddOnService service){

        reservationServices.putIfAbsent(reservationId,new ArrayList<>());

        reservationServices.get(reservationId).add(service);
    }

    public void printServices(String reservationId){

        List<AddOnService> list = reservationServices.get(reservationId);

        if(list == null){
            System.out.println("No services added.");
            return;
        }

        double total = 0;

        System.out.println("\nServices for Reservation " + reservationId);

        for(AddOnService s : list){

            System.out.println(s.getName() + " : " + s.getPrice());

            total += s.getPrice();
        }

        System.out.println("Total Service Cost: " + total);
    }
}