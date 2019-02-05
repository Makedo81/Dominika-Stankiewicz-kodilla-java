package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final String bun;
    private final int burgers;
    private final List<String> sauce;

    public static class BigMacBuilder {

        private String bun;
        private int burgers;
        private List<String> sauce = new ArrayList<>();

        public BigMacBuilder Bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder SauceType(String sauceType) {
            sauce.add(sauceType);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce);
        }
    }
        private BigMac(final String bun, final int burgers, final List<String> sauce) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = new ArrayList<>(sauce);
        }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                '}';
    }
}


