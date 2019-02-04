package com.kodilla.good.patterns.challenges.fightSearch;

public class Airport {

    String city;

    public Airport(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return city != null ? city.equals(airport.city) : airport.city == null;
    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }
}
