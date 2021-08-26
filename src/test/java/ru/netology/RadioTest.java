package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMinVolume() - 12);
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMaxVolume() + 12);
        int actual = rad.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());

        rad.turnUpVolume(15);

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());

        rad.turnDownVolume(0);

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetTurnDownMinVolume() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setTurnDownMinVolume(0);
        int actual = rad.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    void shouldSetTurnUpMaxVolume() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setTurnUpMaxVolume(23);
        int actual = rad.getCurrentVolume();


        assertEquals(expected, actual);
    }


    @Test
    void shouldNotSetStationBelowMin() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(rad.getMinStation() - 12);
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(rad.getMaxStation() + 12);
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

   @Test
    public void turnUpNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());

        rad.NextStation(10);

        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
  }

   @Test
   public void turnDownPrevStation() {
       Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());

        rad.PrevStation(-1);

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
   }

    @Test
    void shouldSetMinStation() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setMinStation(0);
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxStation() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setMaxStation(23);
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
}