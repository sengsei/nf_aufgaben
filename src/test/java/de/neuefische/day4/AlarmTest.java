package de.neuefische.day4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void shouldAlarmIfPersonHigher30() {
        // given
        int value = 31;

        // then
        String result = Alarm.alarmAusgabe(value, Alarmstufe.YELLOW);

        // when
        assertEquals("Zu viele Personen", result );

    }

    @Test
    void shouldAlarmIfPersonLower30() {
        // given
        int value = 29;

        // then
        String result = Alarm.alarmAusgabe(value, Alarmstufe.YELLOW);

        // when
        assertEquals("Maximale Personenzahl nicht überschritten", result );

    }

    @Test
    void shouldRedAlarm() {
        // given
        Alarmstufe alarmlevel = Alarmstufe.RED;

        // then
        String result = Alarm.alarmAusgabe(42, Alarmstufe.RED);

        // when
        assertEquals("keine Personen erlaubt", result);
    }

    @Test
    void shouldYellowAlarm() {
        // given
        Alarmstufe alarmlevel = Alarmstufe.YELLOW;

        // then
        String result = Alarm.alarmAusgabe(42, Alarmstufe.YELLOW);

        // when
        assertEquals("Zu viele Personen", result);
    }

    @Test
    void shouldGreenAlarm() {
        // given
        Alarmstufe alarmlevel = Alarmstufe.GREEN;

        // then
        String result = Alarm.alarmAusgabe(60, Alarmstufe.GREEN);

        // when
        assertEquals("Maximale Personenzahl nicht überschritten", result);
    }


}