package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMaxVolume() + 10);
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMinVolume() - 10);
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void ShouldSetNextStation() {
        Radio rad = new Radio();
        rad.setNextStation();

        int expected = rad.getCurrentStation();

        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevStation() {
        Radio rad = new Radio();
        rad.setPrevStation();

        int expected = rad.getCurrentStation();

        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
}