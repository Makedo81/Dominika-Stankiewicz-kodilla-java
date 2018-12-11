package com.kodilla.stream.world;
import java.math.BigDecimal;

public final class Country{

    private final String countryName;
    private final BigDecimal peoplesQuantity;


    public Country(final String countryName,final BigDecimal peoplesQuantity) {
        this.countryName = countryName;
        this.peoplesQuantity = peoplesQuantity;
    }

    public String getCountryName(){
        return (countryName);
    }

    public BigDecimal getPeoplesQuantity() {
        return peoplesQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}

