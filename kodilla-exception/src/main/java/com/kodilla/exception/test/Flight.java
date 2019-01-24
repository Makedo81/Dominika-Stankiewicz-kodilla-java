package com.kodilla.exception.test;

import java.util.ArrayList;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport,String arrivalAirport ) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }



    public void addFlight(Flight flight) {

        ArrayList<Flight> flights = new ArrayList<>();
        Flight flight1 = new Flight("Berlin", "London");
        Flight flight2 = new Flight("Amsterdam", "London");
        Flight flight3 = new Flight("Amsterdam", "Prague");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
    }
    public void getFlight(){

    }
    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

}
