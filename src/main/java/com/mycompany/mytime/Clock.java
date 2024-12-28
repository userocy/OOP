/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytime;

/**
 *
 * @author Oceane
 */
class Clock {
    private int hours = 12; // Initialize to a valid hour
    private int minutes = 0; // Initialize to a valid minute
    private int seconds = 0; // Initialize to a valid second
    private boolean isPM = false; // Default to AM

    public void setHours(int hours) {
        if (hours > 0 && hours <= 12) {
            this.hours = hours;
        } else {
            System.out.println("Invalid hours. Please enter a value between 1 and 12.");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.println("Invalid minutes. Please enter a value between 0 and 59.");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            System.out.println("Invalid seconds. Please enter a value between 0 and 59.");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void advanceTime(int seconds) {
        this.seconds += seconds;

        this.minutes += this.seconds / 60;
        this.seconds %= 60;

        this.hours += this.minutes / 60;
        this.minutes %= 60;

        if (this.hours > 12) {
            this.isPM = !this.isPM;
            this.hours %= 12;
        }

        if (this.hours == 0) {
            this.hours = 12;
        }
    }

    public void tickBySecond() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            tickByMinute();
        }
    }

    public void tickByMinute() {
        minutes++;
        if (minutes >= 60) {
            minutes = 0;
            tickByHour();
        }
    }

    public void tickByHour() {
        hours++;
        if (hours > 12) {
            hours = 1; // Wrap around to 1 after 12
            isPM = !isPM;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, (isPM) ? "PM" : "AM");
    }
}