package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Airport airport = new Airport("Berlin");

        List<Airport> flightsFrom = flightSearch.findFlightsFrom(airport);
        //List<Airport> flightsTo = flightSearch.findFlightsTo(airport);

    }
}