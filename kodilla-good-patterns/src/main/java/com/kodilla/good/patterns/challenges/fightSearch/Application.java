package com.kodilla.good.patterns.challenges.fightSearch;

public class Application {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Flight flightToFind = new Flight("Warsaw", "Amsterdam");
 //     flightSearch.findFlightsFrom(flightToFind.getCityDeparture());
 //     flightSearch.findFlightsTo(flightToFind.getCityArrival());

    flightSearch.findNonDirectFlight(flightToFind);
    }
}