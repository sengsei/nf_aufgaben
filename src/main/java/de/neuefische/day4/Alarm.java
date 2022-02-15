package de.neuefische.day4;

public class Alarm {

    public static String alarmAusgabe(int value, Alarmstufe alarmlevel) {

        return alarmlevel.getPersonCheck(value);

    }

}
