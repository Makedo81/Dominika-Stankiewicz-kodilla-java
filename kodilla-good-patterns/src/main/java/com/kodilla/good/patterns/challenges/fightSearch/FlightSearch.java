package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlightSearch {

    FlightsMap flightsMap = new FlightsMap();

    private List<Flight> findFlightsFrom(String cityDeparture) {

          List<Flight> flightsAvailableFrom = flightsMap.getFlight().entrySet().stream()
                .filter(k -> k.getKey().equals(cityDeparture))
                .flatMap(v -> v.getValue().stream())
                .collect(Collectors.toList());
        return flightsAvailableFrom;
    }

    private List<Flight> findFlightsTo(String cityArrival) {

        List<Flight> flights = flightsMap.getFlight().entrySet().stream()
                .flatMap(k -> k.getValue().stream())
                .filter(m -> m.getCityArrival().equals(cityArrival))
                .collect(toList());
        return flights;
    }

    private Map<Flight,List<Flight>> findNonDirectFlight(Flight flight) {
        Map<Flight,List<Flight>> nonDirectFlights = new HashMap<>();
        if (!findFlightsFrom(flight.getCityDeparture()).contains(flight)) {
            System.out.println("Checking non direct flights...");
            List<Flight>alternativeAirport = findFlightsTo(flight.getCityArrival());
            System.out.println("Available flights to " + flight.getCityArrival() + ":" + "\n");
            for (Flight flightTo : alternativeAirport) {
                System.out.println(flightTo);
            }
            nonDirectFlights.put(flight,alternativeAirport);
        }
        return nonDirectFlights;
    }
    public void findFlight(Flight flight) {

        boolean flightExist = findFlightsFrom(flight.getCityDeparture()).contains(flight);
            List<Flight> availableFlights = findFlightsFrom(flight.getCityDeparture());
            System.out.println("Available flights from " + flight.cityDeparture + ":" + "\n");
            for (Flight flightTo : availableFlights) {
                System.out.println(flightTo);
            }
            if(flightExist){
            List<Flight> availableFlightsTo = findFlightsTo(flight.getCityArrival());
                System.out.println("Available flights to " + flight.cityArrival + ":" + "\n");
                for (Flight flightFrom : availableFlightsTo) {
                    System.out.println(flightFrom);
                }

        }   else {
                Map<Flight,List<Flight>> entry = findNonDirectFlight(flight);
                entry.forEach((key, value) -> {
                    for (Flight flight1 : value) {
                        String connection = key.cityDeparture + "-" + flight1.getCityDeparture()+ "-" + key.getCityArrival();
                        System.out.println("Non direct connection found : " + "\n" + connection + "\n");
                    }
                });
            }
    }
}

