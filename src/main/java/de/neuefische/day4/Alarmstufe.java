package de.neuefische.day4;

public enum Alarmstufe {
    RED(0),
    YELLOW(30),
    GREEN(60);

    private int anzPersonen;

    Alarmstufe(int anzPersonen) {
        this.anzPersonen = anzPersonen;
    }

    public String getPersonCheck(int value){
        if (anzPersonen == 0){
            return "keine Personen erlaubt";
        }
        if (value > anzPersonen) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
