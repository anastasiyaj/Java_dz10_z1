package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldIncreaseVoidPositive() {

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumePositive() {

        radio.setCurrentVolume(98);
        radio.decreaseVolume();

        int expected = 97;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVoidNegative() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeNegative() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldValidRadioStation() {

        radio.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldInvalidRadioStation() {

        radio.setCurrentRadioStation(12);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextOfLimit() {

        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevOfLimit() {

        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldValidWithGivenSizeRadioStation() {
        Radio radio = new Radio(18);
        radio.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldInvalidWithGivenSizeRadioStation() {
        Radio radio = new Radio(18);
        radio.setCurrentRadioStation(19);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextOfLimitWithGivenSize() {
        Radio radio = new Radio(18);
        radio.setCurrentRadioStation(17);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevOfLimitWithGivenSize() {
        Radio radio = new Radio(18);
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 17;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
