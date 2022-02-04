package de.neuefische.day4;

public class Alarm {

    public static String alarmAusgabe(int value, String alarmlevel) {

        switch (alarmlevel) {
            case "gelb":
                return getPersonCheck(value, 30);
            case "grün":
                return getPersonCheck(value, 60);
            case "rot":
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
