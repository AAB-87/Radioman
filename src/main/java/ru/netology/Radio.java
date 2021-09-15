package ru.netology;

public class Radio {

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public int getCurrentVolume() { return currentVolume; }

    public void setTurnUpMaxVolume(int newMaxVolume) { this.maxVolume = maxVolume; }

    public void setTurnDownMinVolume(int newMinVolume) { this.minVolume = minVolume; }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void turnUpVolume(int newCurrentVolume) {
        setCurrentVolume(newCurrentVolume + 1);

    }

    public void turnDownVolume(int newCurrentVolume) {
        setCurrentVolume(newCurrentVolume - 1);

    }


    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    public int getCurrentStation() { return currentStation; }

    public int getMinStation() { return minStation; }

    public int getMaxStation() { return maxStation; }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
        this.currentStation = currentStation - 1;
    }

    public void setMaxStation(int maxStation) { this.maxStation = maxStation; }

    public void setMinStation(int minStation) { this.minStation = minStation; }

}