package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsMap {

    public Map<String, List<Flight>> getFlight() {

        List<Flight> Warsaw = new ArrayList<>();
        Warsaw.add(new Flight("Warsaw","Danzig"));
        Warsaw.add(new Flight("Warsaw","Berlin"));

        List<Flight> Berlin = new ArrayList<>();
        Berlin.add(new Flight("Berlin","Danzig"));
        Berlin.add(new Flight("Berlin","Hamburg"));
        Berlin.add(new Flight("Berlin","Amsterdam"));

        List<Flight> Danzig = new ArrayList<>();
        Danzig.add(new Flight("Danzig","London"));
        Danzig.add(new Flight("Danzig","Moscow"));
        Danzig.add(new Flight("Danzig","Amsterdam"));

        Map<String, List<Flight>> availableFlights = new HashMap<>();
        availableFlights.put("Warsaw",Warsaw);
        availableFlights.put("Berlin",Berlin);
        availableFlights.put("Danzig",Danzig);

        return availableFlights;
    }
}
