package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
public void shouldGetAndSetCurrentRadioStation() {

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetCurrentVolumeSound() {

        radio.setCurrentVolumeSound(0);
        assertEquals(0, radio.getCurrentVolumeSound());

        radio.setCurrentVolumeSound(5);
        assertEquals(5, radio.getCurrentVolumeSound());

        radio.setCurrentVolumeSound(9);
        assertEquals(9, radio.getCurrentVolumeSound());

        radio.setCurrentVolumeSound(10);
        assertEquals(10, radio.getCurrentVolumeSound());

        radio.setCurrentVolumeSound(-1);
        assertEquals(10, radio.getCurrentVolumeSound());

        radio.setCurrentVolumeSound(11);
        assertEquals(10, radio.getCurrentVolumeSound());
    }

    @Test
    public void shouldGetAndSetMaxVolumeSound() {
        radio.setMaxVolumeSound(10);
        assertEquals(10, radio.getMaxVolumeSound());

        radio.setMaxVolumeSound(9);
        assertEquals(9, radio.getMaxVolumeSound());
    }

    @Test
    public void shouldGetAndSetMinVolumeSound() {
        radio.setMinVolumeSound(0);
        assertEquals(0, radio.getMinVolumeSound());

        radio.setMinVolumeSound(1);
        assertEquals(1, radio.getMinVolumeSound());
    }

    @Test
    public void shouldGetAndSetMaxNumberRadioStation() {
        radio.setMaxNumberRadioStation(9);
        assertEquals(9, radio.getMaxNumberRadioStation());

        radio.setMaxNumberRadioStation(8);
        assertEquals(8, radio.getMaxNumberRadioStation());
    }

    @Test
    public void shouldGetAndSetMinNumberRadioStation() {
        radio.setMinNumberRadioStation(9);
        assertEquals(9, radio.getMinNumberRadioStation());

        radio.setMinNumberRadioStation(8);
        assertEquals(8, radio.getMinNumberRadioStation());
    }


    @Test
    public void shouldIncreaseCurrentVolumeSound() {
        radio.setCurrentVolumeSound(10);
        radio.increaseCurrentVolumeSound();
        assertEquals(10,radio.getCurrentVolumeSound());
    }

    @Test
    public void shouldDecreaseCurrentVolumeSound() {
        radio.setCurrentVolumeSound(0);
        radio.decreaseCurrentVolumeSound();
        assertEquals(0,radio.getCurrentVolumeSound());
    }

    //возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
    @Test
    public void shouldRemoteNumberRadioStation() {
        int [] possibleNumberRadioStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        radio.setCurrentRadioStation(possibleNumberRadioStation[0]);
        assertEquals(possibleNumberRadioStation[0], radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[9]);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[1]);
        assertEquals(1, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[4]);
        assertEquals(4, radio.getCurrentRadioStation());
    }

}
