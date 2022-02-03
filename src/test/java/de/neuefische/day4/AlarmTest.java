package de.neuefische.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void shouldAlarmIfPersonHigher30() {
        // given
        int value = 31;

        // then
        String result = Alarm.alarmAusgabe(value);

        // when
        assertEquals("Zu viele Personen", result );

    }

    @Test
    void shouldAlarmIfPersonLower30() {
        // given
        int value = 29;

        // then
        String result = Alarm.alarmAusgabe(value);

        // when
        assertEquals("Maximale Personenzahl nicht überschritten", result );

    }
}