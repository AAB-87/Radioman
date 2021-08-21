package ru.netology;

public class Radio {

    private int currentVolume = 7;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
    }


    private int currentStation = 3;
    private int maxStation = 9;
    private int minStation = 0;

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setNextStation() {
        if (currentStation > 9) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation() {
        if (currentStation < 0) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }
}


