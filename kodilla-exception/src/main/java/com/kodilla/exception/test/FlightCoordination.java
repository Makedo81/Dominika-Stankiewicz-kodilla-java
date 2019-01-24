package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightCoordination {

   // ArrayList flight = new ArrayList<Flight>();


    public void findFlight(Flight flight) {


        Map<String, Boolean> flightDestinations = new HashMap<>();


        flightDestinations.put("Berlin" + "Prague", true);
        flightDestinations.put("London" + "Madrid", false);
        flightDestinations.put("Amsterdam" + "Dresden", true);
        flightDestinations.put("Prague" + "Dresden", false);

        for (Map.Entry<String, Boolean> entry : flightDestinations.entrySet()) {
            if (flightDestinations.containsKey(flight.getArrivalAirport() + flight.getDepartureAirport())) {
                System.out.println("1");
                if (flightDestinations.containsKey(flight.getArrivalAirport() + flight.getDepartureAirport())) {
                    System.out.println("2");
                    if (entry.getValue()) {

                        System.out.println("ok");
                    }
                }

            }
        }

    }

    public static void main(String[] args) {

        Flight flight = new Flight("Prague", "Dresden");

      //  System.out.println("Give departure airport:   " + flight1.getDepartureAirport());
      //  System.out.println("Give arrival airport:   " + flight1.getArrivalAirport());

        FlightCoordination flightCoordination = new FlightCoordination();
        flightCoordination.findFlight(flight);

    }
}

