package ru.netology;

public class Radio {

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public int getCurrentVolume() { return currentVolume; }

    public void setMaxVolume(int maxVolume) { this.maxVolume = maxVolume; }

    public void setMinVolume(int minVolume) { this.minVolume = minVolume; }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void maxVolume() {
        if (currentVolume == maxVolume) {
            this.currentStation = currentStation + 1;
        }

    }

    public void minVolume() {
        if (currentVolume == minVolume) {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentStation() { return currentStation; }

    public int getMinStation() { return minStation; }

    public int getMaxStation() { return maxStation; }

    public void setMaxStation(int maxStation) { this.maxStation = maxStation; }

    public void setMinStation(int minStation) { this.minStation = minStation; }


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
            return;
        }
        this.currentStation = currentStation - 1;
    }

}