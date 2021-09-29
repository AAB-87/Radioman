package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void containsTheNumberOfStations() { // Новая версия. Содержит количество станций
        Radio rad = new Radio(3);

        assertEquals(3, rad.getNumberOfStations());
    }
//
//    @Test
//    public void shouldTheNumberOfStations() { // Новая версия
//        Radio rad = new Radio(9);
//        rad.setCurrentStation(9);
//
//        assertEquals(0, rad.getCurrentStation());
//    }
//
//
    @Test
    public void shouldNotSetVolumeBelowMin() { // Громкость не устанавливается ниже минимальной
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMinVolume() - 12);
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() { // Громкость не устанавливается выше максимальной
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMaxVolume() + 12);
        int actual = rad.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume() { // Увеличить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseTheVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume1() { // Увеличить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.increaseTheVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolume2() { // Увеличить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseTheVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume() { // Уменьшить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume1() { // Уменьшить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.decreaseTheVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume2() { // Уменьшить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(30);

        rad.decreaseTheVolume();

        int expected = 29;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeNotEqualToMaxVolume() { // Текущая громкость не равна максимальной
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMinVolume());

        rad.increaseTheVolume();

        int expected = rad.getMinVolume() + 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeNotEqualToMinVolume() { // Текущая громкость не равна минимальной
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMaxVolume());

        rad.decreaseTheVolume();

        int expected = rad.getMaxVolume() - 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
//
//    @Test
//    public void shouldSetTurnDownMinVolume() { // Установка минимальной громкости
//        Radio rad = new Radio();
//
//        int expected = rad.getCurrentVolume();
//        rad.setMinVolume(0);
//        int actual = rad.getCurrentVolume();
//
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetTurnUpMaxVolume() { // Установка максимальной громкости
//        Radio rad = new Radio();
//
//        int expected = rad.getCurrentVolume();
//        rad.setMaxVolume(23);
//        int actual = rad.getCurrentVolume();
//
//
//        assertEquals(expected, actual);
//    }
//
//
    @Test
    public void shouldNotSetStationBelowMin() { // Невозможность установки станции ниже минимальной
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(rad.getMinStation() - 12);
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() { // Невозможность установки станции выше макcимальной
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(rad.getNumberOfStations() + 12);
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
//
//   @Test
//    public void CurrentStationNotEqualToMaxStation() { // Текущая станция не равна максимальной
//        Radio rad = new Radio();
//
//        rad.setCurrentStation(rad.getMinStation());
//
//        rad.nextStation();
//
//        int expected = rad.getMinStation();
//        int actual = rad.getCurrentStation() - 1;
//
//        assertEquals(expected, actual);
//  }
//
//    @Test
//    public void CurrentStationNotEqualToMinStation() { // Текущая станция не равна минимальной
//        Radio rad = new Radio();
//
//        rad.setCurrentStation(rad.getNumberOfStations());
//
//        rad.prevStation();
//
//        int expected = rad.getNumberOfStations();
//        int actual = rad.getCurrentStation() + 1;
//
//        assertEquals(expected, actual);
//    }

    @Test
    public void turnUpNextStation() { // Переключение на следующую станцию с 9 на 0
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpNextStation1() { // Переключение на следующую станцию c 8 на 9
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnUpNextStation2() { // Переключение на следующую станцию с 0 на 1
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation() { // Переключение на следующую станцию с 9 на 8
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        rad.prevStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation1() { // Переключение на следующую станцию с 0 на 9
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownPrevStation2() { // Переключение на следующую станцию с 1 на 0
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }




//
//    @Test
//    public void shouldSetMinStation() { // Установка минимальной станции
//        Radio rad = new Radio();
//
//        int expected = rad.getCurrentStation();
//        rad.setMinStation(0);
//        int actual = rad.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }

//    @Test
//    public void shouldSetMaxStation() { // Установка максимальной станции
//        Radio rad = new Radio();
//
//        int expected = rad.getCurrentStation();
//        rad.setNumberOfStations(9);
//        int actual = rad.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
}