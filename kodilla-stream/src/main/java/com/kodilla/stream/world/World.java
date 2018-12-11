package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World  {

    private final Set<Continent> world = new HashSet<>();

    public World() {

    }

    public void addContinent(Continent continent) {

        world.add(continent);
    }


    public BigDecimal getTotalPeopleQuantity() {
        BigDecimal worldPeopleQuantity = world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeoplesQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return worldPeopleQuantity;
    }
}
