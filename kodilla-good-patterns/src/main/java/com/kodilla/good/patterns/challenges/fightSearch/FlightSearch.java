package com.kodilla.good.patterns.challenges.fightSearch;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlightSearch {

    FlightsMap flightsMap = new FlightsMap();

    public List<Flight> findFlightsFrom(String cityDeparture) {

        List<Flight> flightsAvailableFrom=flightsMap.getFlight().entrySet().stream()
                .filter(k -> k.getKey().equals(cityDeparture))
                .flatMap(v -> v.getValue().stream())
                .collect(Collectors.toList());
        System.out.println("Available flights from " + cityDeparture + ":" + "\n" + flightsAvailableFrom);
        return flightsAvailableFrom;
    }

    public Flight findFlightsTo(String cityArrival) {

        Flight alternativeFlight = new Flight();
        List<Flight> flight = flightsMap.getFlight().entrySet().stream()
                .flatMap(k -> k.getValue().stream())
                .filter(m -> m.getCityArrival().equals(cityArrival))
                .collect(toList());
        System.out.println(flight);
        for (int i = 0; i < flight.size(); i++) {
            alternativeFlight = flight.get(i); //tutaj lista flights ma 2 obiekty
        }
        return alternativeFlight; //zwraca tylko jeden obiekt.
        // Nie wiem gdzie dodac petle zeby zwracane byly wszystkie mozliwe obiekty
        // dla metody findNonDirectFlight(Flight flight)
        //np.wywolujac metode dla "warszawa-amsterdam" zwraca mi tylko jeden lot
    }

    public void findNonDirectFlight(Flight flight) {

        if (!findFlightsFrom(flight.getCityDeparture()).contains(flight)) {
            System.out.println("Checking non direct flights...");
            Flight alternativeAirport = findFlightsTo(flight.getCityArrival());
            System.out.println("Available flight :" + "\n" + flight.getCityDeparture()+"-"
                    +alternativeAirport.getCityDeparture()+"-"+flight.getCityArrival());
        }
        else System.out.println("Available flights to "+flight.getCityArrival()+":");
            findFlightsTo(flight.getCityArrival());
    }
}
