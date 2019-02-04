package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsMap {

    public Map<Airport, List<Airport>> getFlight() {

        List<Airport> Warsaw = new ArrayList<>();
        Warsaw.add(new Airport("Danzig"));
        Warsaw.add(new Airport("Berlin"));

        List<Airport> Berlin = new ArrayList<>();
        Berlin.add(new Airport("Danzig"));
        Berlin.add(new Airport("Hamburg"));
        Berlin.add(new Airport("Amsterdam"));

        Map<Airport, List<Airport>> availableFlights = new HashMap<>();
        availableFlights.put(new Airport("Warsaw"),Warsaw);
        availableFlights.put(new Airport("Berlin"),Berlin);

        return availableFlights;
    }
}
