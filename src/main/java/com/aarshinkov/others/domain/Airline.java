package com.aarshinkov.others.domain;

import java.util.Arrays;
import java.util.List;

public class Airline {

    private final String airlineId;
    private final List<String> availableStands;

    public Airline(String airlineId, String... availableStands) {
        this.airlineId = airlineId;
        this.availableStands = Arrays.asList(availableStands);
    }

    public String getAirlineId() {
        return airlineId;
    }

    public List<String> getAvailableStands() {
        return availableStands;
    }
}
