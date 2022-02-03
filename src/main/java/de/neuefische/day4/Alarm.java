package de.neuefische.day4;

public class Alarm {

    public static String alarmAusgabe(int value, String alarmlevel) {

        switch (alarmlevel) {
            case "gelb":
                if (value > 30) {
                    return "Zu viele Personen";
                } else {
                    return "Maximale Personenzahl nicht überschritten";
                }
            case "grün":
                if (value > 60) {
                    return "Zu viele Personen";
                } else {
                    return "Maximale Personenzahl nicht überschritten";
                }
            case "rot":
                return "keine Personen erlaubt";
            default:
                return "Gefahrenlevel unbekannt!";
        }

    }

}
