package com.aarshinkov.others.stands;

import com.aarshinkov.others.domain.Airline;

import java.util.List;

public class StandsLBSF extends Stands {

    public StandsLBSF() {
        super("LBSF");
    }

    @Override
    public void initializeStands() {
        this.stands.add("1");
        this.stands.add("2");
        this.stands.add("3");
        this.stands.add("4");
        this.stands.add("4A");
        this.stands.add("4B");
        this.stands.add("5");
        this.stands.add("6");
        this.stands.add("7");
        this.stands.add("8");
        this.stands.add("9");
        this.stands.add("10");
        this.stands.add("11");
        this.stands.add("12");
        this.stands.add("12A");
        this.stands.add("13");
        this.stands.add("13A");
        this.stands.add("14");
        this.stands.add("14A");
        this.stands.add("15");
        this.stands.add("15A");
        this.stands.add("16");
        this.stands.add("16A");
        this.stands.add("17");
        this.stands.add("18");
        this.stands.add("19");
        this.stands.add("20");
        this.stands.add("21");
        this.stands.add("22");
        this.stands.add("23");
        this.stands.add("24");
        this.stands.add("25");
        this.stands.add("26");
        this.stands.add("27");
        this.stands.add("28");
        this.stands.add("29");
        this.stands.add("29A");
        this.stands.add("30");
        this.stands.add("30A");
        this.stands.add("31");
        this.stands.add("31A");
        this.stands.add("32");
        this.stands.add("32A");
        this.stands.add("33");
        this.stands.add("33A");
        this.stands.add("34");
        this.stands.add("34A");
        this.stands.add("35");
        this.stands.add("36");
        this.stands.add("37");
        this.stands.add("38");
        this.stands.add("39");
        this.stands.add("40");
        this.stands.add("41");
        this.stands.add("42");
        this.stands.add("43");
        this.stands.add("44");
    }

    @Override
    public void initializeAirlines() {
        this.airlines.add(new Airline("AEE", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("AIZ", "5", "6", "10", "11", "24", "25", "26", "27", "28"));
        this.airlines.add(new Airline("ASL", "12", "13"));
        this.airlines.add(new Airline("AUA", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"));
        this.airlines.add(new Airline("BAW", "3", "7"));
        this.airlines.add(new Airline("BGH", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"));
        this.airlines.add(new Airline("BTI", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("BUC", "5", "6", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"));
        this.airlines.add(new Airline("BVL", "5", "6", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("CAI", "3", "7", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("DLH", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("ELY", "3", "7", "14"));
        this.airlines.add(new Airline("EZY", "20", "21", "22", "23", "24", "25", "26", "27", "28"));
        this.airlines.add(new Airline("FDB", "3", "7"));
        this.airlines.add(new Airline("GBG", "3", "14"));
        this.airlines.add(new Airline("ITY", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("LOT", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("LZB", "1", "2", "4B", "5", "6", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("NOZ", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("PGT", "12", "23"));
        this.airlines.add(new Airline("QTR", "3", "7"));
        this.airlines.add(new Airline("ROT", "12", "13"));
        this.airlines.add(new Airline("RYR", "4B", "12", "13", "14", "15", "16", "17", "18", "19"));
        this.airlines.add(new Airline("SEH", "12", "13"));
        this.airlines.add(new Airline("SWR", "1", "2", "8", "9", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"));
        this.airlines.add(new Airline("THY", "3", "7", "14"));
        this.airlines.add(new Airline("WZZ", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"));
    }
}
