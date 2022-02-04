package de.neuefische.day4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void shouldAlarmIfPersonHigher30() {
        // given
        int value = 31;

        // then
        String result = Alarm.alarmAusgabe(value, "gelb");

        // when
        assertEquals("Zu viele Personen", result );

    }

    @Test
    void shouldAlarmIfPersonLower30() {
        // given
        int value = 29;

        // then
        String result = Alarm.alarmAusgabe(value, "gelb");

        // when
        assertEquals("Maximale Personenzahl nicht überschritten", result );

    }

    @Test
    void shouldRedAlarm() {
        // given
        String alarmlevel = "rot";

        // then
        String result = Alarm.alarmAusgabe(42, "rot");

        // when
        assertEquals("keine Personen erlaubt", result);
    }

    @Test
    void shouldYelloAlarm() {
        // given
        String alarmlevel = "gelb";

        // then
        String result = Alarm.alarmAusgabe(42, "gelb");

        // when
        assertEquals("Zu viele Personen", result);
    }


}