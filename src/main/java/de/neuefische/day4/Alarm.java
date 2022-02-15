package de.neuefische.day4;

public class Alarm {

    public static String alarmAusgabe(int value, Alarmstufe alarmlevel) {

        switch (alarmlevel) {
            case GELB:
                return getPersonCheck(value, 30);
            case GRÜN:
                return getPersonCheck(value, 60);
            case ROT:
                return "keine Personen erlaubt";
            default:
                return "Gefahrenlevel unbekannt!";
        }

    }

    private static String getPersonCheck(int value, int x) {
        if (value > x) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

}
