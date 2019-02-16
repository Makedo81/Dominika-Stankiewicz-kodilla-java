package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCoordination {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Moscow", true);
        flights.put("Berlin", true);
        flights.put("Oslo", false);
        flights.put("Warsaw", false);
        flights.put("Dresden", true);

        for (Map.Entry<String, Boolean> k : flights.entrySet()) {

            String key = k.getKey();
            Boolean value = k.getValue();
            if (key.equals(flight.getDepartureAirport())) {
                if (value.equals(true)) {
                    System.out.println("There are available flights from " + key);
                }else
                    { System.out.println("Flights from " + key + " are not available.");}
            }
                if (key.equals((flight.getArrivalAirport()))) {
                    if (value.equals(true)) {
                        System.out.println("There are available flights to " + key);
                    }else System.out.println("Flights to " + key + " are not available.");
            }
                 else if (!(flights.containsKey(flight.getDepartureAirport())&& flights.containsKey(flight.getArrivalAirport())))
                    throw new RouteNotFoundException("Departure airport or arrival airport might not exist");
        }
    }

        public static void main (String[]args) {

            Flight flight = new Flight("Warsaw", "Moscow");
            FlightCoordination flightCoordination = new FlightCoordination();
            try {
                flightCoordination.findFlight(flight);
            } catch (RouteNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }


