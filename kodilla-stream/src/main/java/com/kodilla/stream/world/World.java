package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static jdk.nashorn.internal.objects.NativeArray.reduce;

public final class World {

    private final Continent continent;
    private final Set<Continent> world = new HashSet<>();

    public void addContinent(Continent continent) {
        world.add(continent);
    }
    public Set<Continent> getContinent() {
        return world;
    }
    public BigDecimal getPeopleQuantity(){
          BigDecimal worldPeopleQuantity = world.stream()
                .flatMap(continent->continent.getCountry().stream())
                .filter(country->country !=this)
                .map(Country::getPeoplesQuantity)
                .reduce(BigDecimal.ZERO, (worldPeopleQuantity,
                                          current)-> worldPeopleQuantity = worldPeopleQuantity.add(current));

    }
}
