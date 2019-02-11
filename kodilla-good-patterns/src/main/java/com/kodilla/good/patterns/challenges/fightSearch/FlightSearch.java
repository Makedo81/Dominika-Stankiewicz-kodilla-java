package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightSearch {

    FlightsMap flightsMap = new FlightsMap();

    public List<Flight> findFlightsFrom(String cityDeparture) {

        List<Flight> flightsAvailableFrom = new ArrayList<>();
        flightsMap.getFlight().forEach((key, value) -> {
            if (key.equals(cityDeparture)) {
                value.forEach(flightsAvailableFrom::add);
            }
        });
        System.out.println(flightsAvailableFrom+ "\n");
        return flightsAvailableFrom;
    }

    public String findFlightsTo(String cityArrival) {
        for (Map.Entry<String, List<Flight>> entry : flightsMap.getFlight().entrySet()) {
            String key = entry.getKey();
            List<Flight> value = entry.getValue();
            for (Flight flightsAvailableTo : value) {
                if (flightsAvailableTo.getCityArrival().equals(cityArrival)) {
                    System.out.println("There are available flights from :" + key+ "\n");
                    return key;
                }
            }
        }
        return cityArrival;
    }

    public boolean findNonDirectFlight(Flight flight) {
        if (!findFlightsFrom(flight.getCityDeparture()).contains(flight)) {
           // System.out.println("Checking non direct flights" + flight);
            String alternativeAirport = findFlightsTo(flight.getCityArrival());
            System.out.println("Checking flights through:  " + alternativeAirport+ "\n");
            List<Flight> alternativeFlights = findFlightsFrom(alternativeAirport);
            for (Flight result : alternativeFlights) {
                if (result.getCityArrival() == flight.getCityArrival()) {
                    System.out.println("Available  " + result);
                }
     //           else System.out.println("Flight not exist");
            }
        }
        return false;
    }
}
