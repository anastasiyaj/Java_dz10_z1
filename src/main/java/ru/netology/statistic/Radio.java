package ru.netology.statistic;

public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
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

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (newCurrentRadioStation <= 9 & newCurrentRadioStation >= 0) {
            currentRadioStation =newCurrentRadioStation;
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
