package com.belajarinterface;

public class MacBook implements Laptop {

    private int volume;
    boolean is_power_on;

    public MacBook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is on");
        System.out.println("MacBook Powefull on Coding");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process ...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is full");
            } else {
                this.volume += 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
