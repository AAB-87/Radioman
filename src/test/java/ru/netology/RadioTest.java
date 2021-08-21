package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setTurnUpVolume(rad.getMaxVolume() + 10);

        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setTurnDownVolume(rad.getMinVolume() - 10);

        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void ShouldSetNextStation() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setNextStation(rad.getMaxStation() + 10);

        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevStation() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setPrevStation(rad.getMinStation() - 10);

        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
}
