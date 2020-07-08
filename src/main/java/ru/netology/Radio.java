package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeSound;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int maxVolumeSound = 10;
    private int minVolumeSound = 0;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minNumberRadioStation) {
        return;
        } else if (currentRadioStation > maxNumberRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolumeSound() {
        return currentVolumeSound;
    }

    public void setCurrentVolumeSound(int currentVolumeSound) {
        if (currentVolumeSound < minVolumeSound) {
            return;
        } else if (currentVolumeSound > maxVolumeSound) {
            return;
        }
        this.currentVolumeSound= currentVolumeSound;
    }

    public int getMaxNumberRadioStation() {

        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {

        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {

        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getMaxVolumeSound() {

        return maxVolumeSound;
    }

    public void setMaxVolumeSound(int maxVolumeSound) {

        this.maxVolumeSound = maxVolumeSound;
    }

    public int getMinVolumeSound() {

        return minVolumeSound;
    }

    public void setMinVolumeSound(int minVolumeSound) {

        this.minVolumeSound = minVolumeSound;
    }

    public void increaseCurrentVolumeSound() {
        if (currentVolumeSound == maxVolumeSound) {
            return;
        }
        currentVolumeSound++;
    }

    public void decreaseCurrentVolumeSound() {
        if (currentVolumeSound == minVolumeSound) {
            return;
        }
        currentVolumeSound--;
    }

}
