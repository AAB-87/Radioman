package ru.netology;

public class Radio {

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
//    private int maxStation = 9;
    private int minStation = 0;
    private int numberOfStations = 10;


    public Radio() {
    }

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public int getCurrentVolume() { return currentVolume; }

//    public void setMaxVolume(int maxVolume) { this.maxVolume = maxVolume; }
//
//    public void setMinVolume(int minVolume) { this.minVolume = minVolume; }

//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume > maxVolume) {
//            return;
//        }
//        if (currentVolume < minVolume) {
//            return;
//        }
//        this.currentVolume = currentVolume;
//    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseTheVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseTheVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

    public int getCurrentStation() { return currentStation; }

    public int getMinStation() { return minStation; }

//    public int getMaxStation() { return maxStation; }

//    public void setMaxStation(int maxStation) { this.maxStation = maxStation; }

//    public void setMinStation(int minStation) { this.minStation = minStation; }

    public int getNumberOfStations() { return numberOfStations; }


    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation <= minStation) {
            currentStation = numberOfStations;
        }
        if (currentStation >= numberOfStations) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        setCurrentStation(currentStation + 1);
    }

    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = numberOfStations;
        }
            this.currentStation = currentStation - 1;
        }
    }
