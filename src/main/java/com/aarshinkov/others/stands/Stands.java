package com.aarshinkov.others.stands;

import com.aarshinkov.others.domain.Airline;

import java.util.*;

public abstract class Stands {

    protected String airportICAO;
    protected List<String> stands;
    protected List<Airline> airlines;

    protected Map<String, List<String>> calculatedStands;
    protected Map<String, List<String>> calculatedStandsNegative;

    public Stands(String airportICAO) {
        this.airportICAO = airportICAO;
        this.stands = new ArrayList<>();
        initializeStands();
        this.airlines = new ArrayList<>();
        initializeAirlines();
        this.calculatedStands = new LinkedHashMap<>();
        calculateStands();
        this.calculatedStandsNegative = new LinkedHashMap<>();
        calculateStandsNegative();
    }

    public void calculateStands() {
        calculateStandsGeneral(true);
    }

    public Map<String, List<String>> getCalculatedStands() {
        return calculatedStands;
    }

    public void calculateStandsNegative() {
        calculateStandsGeneral(false);
    }

    public Map<String, List<String>> getCalculatedStandsNegative() {
        return calculatedStandsNegative;
    }

    public abstract void initializeStands();

    public List<String> getStands() {
        return this.stands;
    }

    public abstract void initializeAirlines();

    public List<Airline> getAirlines() {
        return this.airlines;
    }

    private void calculateStandsGeneral(boolean isPositive) {
        for (String stand : stands) {
            List<String> containedAirlines = new ArrayList<>();
            List<String> nonContainedAirlines = new ArrayList<>();

            for (Airline airline : airlines) {
                boolean doContains = airline.getAvailableStands().contains(stand);

                if (isPositive) {
                    if (doContains) {
                        containedAirlines.add(airline.getAirlineId());
                    }
                } else {
                    if (!doContains) {
                        nonContainedAirlines.add(airline.getAirlineId());
                    }
                }
            }

            if (isPositive) {
                calculatedStands.put(stand, containedAirlines);
            } else {
                calculatedStandsNegative.put(stand, nonContainedAirlines);
            }
        }
    }
}
