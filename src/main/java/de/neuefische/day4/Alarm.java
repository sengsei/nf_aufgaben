package de.neuefische.day4;

public class Alarm {

    public static String alarmAusgabe(int value) {
        if (value > 30) {
            return "Zu viele Personen";
        } else if (value == 30){
            return "30 ist keine gültige Eingabe";
        }
        return "Maximale Personenzahl nicht überschritten";
    }

}
