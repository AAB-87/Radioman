package ru.netology;

public class Radio {

    private int currentVolume = 1;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }



    private int currentStation = 4;
    private int maxStation = 9;
    private int minStation = 0;

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public void setNextStation() {
        if (currentStation == 9) {
            this.currentStation = minStation;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            this.currentStation = maxStation;
        }
        this.currentStation = currentStation - 1;
    }
}