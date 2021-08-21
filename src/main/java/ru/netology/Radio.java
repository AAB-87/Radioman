package ru.netology;

public class Radio {

    private int currentVolume = -1;
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

    public void setTurnUpVolume(int i) {
        if (currentVolume > 10) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setTurnDownVolume(int i) {
        if (currentVolume < 0) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }


//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume > maxVolume) {
//            this.currentVolume = maxVolume;
//        }
//
//        if (currentVolume < minVolume) {
//            return;
//        }




    private int currentStation = 10;
    private int maxStation = 9;
    private int minStation = 0;

    public int getMaxStation() {
        return maxStation;

    }
    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int i) {
        if (currentStation > 9) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation(int i) {
        if (currentStation < 0) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

}
