package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    FlightsMap flightsMap = new FlightsMap();

    public List<Airport> findFlightsFrom(Airport airport) {

        List<Airport> arrivalAirport = flightsMap.getFlight()
                .entrySet().stream()
                .filter(a -> a.getKey().equals(airport))
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.toList());

        System.out.println(arrivalAirport.toString());
        return arrivalAirport;
    }


//    public List<Airport> findFlightsTo(Airport airport) {
//
//        List<Airport> departureAiport =  flightsMap.getFlight()
//                .entrySet().stream()
//                .flatMap(t -> t.getValue().stream())
//                .filter(t -> t==(airport))
//                //return Key
//                .collect(Collectors.toList());
//
//        System.out.println(departureAiport.toString());
//
//        return departureAiport;
//    }

}

