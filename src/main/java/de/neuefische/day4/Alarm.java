package de.neuefische.day4;

public class Alarm {

    public static String alarmAusgabe(int value) {
        if (value > 30) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

}
