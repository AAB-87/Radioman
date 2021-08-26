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
    public void TurnUpMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());

        rad.turnUpVolume(15);

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void TurnDownMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());

        rad.turnDownVolume(-1);

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


//    @Test
//    public void ShouldSetNextStation() {
//        Radio rad = new Radio();
//        rad.setNextStation();
//
//        int expected = rad.getCurrentStation();
//
//        int actual = rad.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldSetPrevStation() {
//        Radio rad = new Radio();
//        rad.setPrevStation();
//
//        int expected = rad.getCurrentStation();
//
//        int actual = rad.getCurrentStation();
//        assertEquals(expected, actual);
//    }

}