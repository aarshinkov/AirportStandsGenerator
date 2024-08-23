package com.aarshinkov.others.stands;

import com.aarshinkov.others.domain.Airline;

public class StandsLBWN extends Stands {

    public StandsLBWN() {
        super("LBSF");
    }

    @Override
    public void initializeStands() {
        this.stands.add("1");
        this.stands.add("1A");
        this.stands.add("2");
        this.stands.add("3");
        this.stands.add("3A");
        this.stands.add("4");
        this.stands.add("5");
        this.stands.add("6");
        this.stands.add("7");
        this.stands.add("8");
        this.stands.add("9");
        this.stands.add("10");
        this.stands.add("11");
        this.stands.add("12");
        this.stands.add("13");
        this.stands.add("14");
        this.stands.add("15");
        this.stands.add("17");
        this.stands.add("17A");
        this.stands.add("18");
        this.stands.add("19");
        this.stands.add("19A");
        this.stands.add("20");
        this.stands.add("20A");
        this.stands.add("21");
        this.stands.add("22");
        this.stands.add("22A");
        this.stands.add("23");
        this.stands.add("24");
        this.stands.add("24A");
        this.stands.add("25");
        this.stands.add("26");
    }

    @Override
    public void initializeAirlines() {
        this.airlines.add(new Airline("AFL", "1A", "3A", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("ART", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("AUA", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("AZO", "5", "6", "7", "8"));
        this.airlines.add(new Airline("BGH", "9", "10", "11", "12", "13", "14", "15"));
        this.airlines.add(new Airline("BLX", "1", "2", "3", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("BUC", "8", "9", "10", "11", "12", "13", "14", "15"));
        this.airlines.add(new Airline("BVL", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("DLH", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("EDW", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("EJU", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("ENT", "3", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("ESZ", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("EWG", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("EZY", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("FHY", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("GJT", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("IRM", "1A", "3A"));
        this.airlines.add(new Airline("ISR", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("JTD", "5", "6", "7", "8"));
        this.airlines.add(new Airline("LGL", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("LYX", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("LZB", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("MYX", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("NOZ", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("NSZ", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("OCN", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("QSM", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("RUK", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("RYR", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("RYS", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("SBI", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("SDM", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("SDR", "1", "2", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("SVR", "3", "4", "5", "6", "7", "8"));
        this.airlines.add(new Airline("TFL", "1", "2", "3", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("THY", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("TOM", "1", "2", "3", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("TUI", "1", "2", "3", "4", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("TVL", "5", "6", "7", "8"));
        this.airlines.add(new Airline("TVP", "5", "6", "7", "8"));
        this.airlines.add(new Airline("TVQ", "5", "6", "7", "8"));
        this.airlines.add(new Airline("TVS", "5", "6", "7", "8"));
        this.airlines.add(new Airline("UBE", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("VKG", "1A", "3A", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("VOE", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("VRG", "8", "9", "10", "11", "12", "13", "14", "15"));
        this.airlines.add(new Airline("WAZ", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("WUK", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
        this.airlines.add(new Airline("WZZ", "5", "6", "7", "8", "20", "21", "22", "23", "24", "25"));
    }
}
