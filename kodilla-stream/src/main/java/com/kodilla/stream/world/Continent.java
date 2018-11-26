package com.kodilla.stream.world;
import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final Country country;
    private final Set<Country> continent = new HashSet<>();

    public void addCountry(Country country){
        continent.add(country);
    }
    public Set<Country>getCountry() {
        return continent;
    }
}
