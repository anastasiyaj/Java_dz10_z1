package ru.netology.statistic;

public class Radio {
    private int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    public Radio() {
        maxRadioStation = 9;
        minRadioStation = 0;
    }

    public Radio(int size) {
        maxRadioStation = size - 1;
        minRadioStation = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void decreaseVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (newCurrentRadioStation <= maxRadioStation & newCurrentRadioStation >= minRadioStation) {
            currentRadioStation = newCurrentRadioStation;
        }
    }

    public void next() {
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);
    }

    public void prev() {
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);
    }
}
