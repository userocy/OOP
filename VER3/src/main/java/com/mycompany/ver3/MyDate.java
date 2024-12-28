/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class MyDate {

    private int month;
    private int day;
    private int year;

    public MyDate(){

    }

    public MyDate(int year){
        this.year = year;
    }

    public MyDate(int year, int month){
        this.year = year;
        this.month = month;
    }

    public MyDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMyDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return String.format("Date: %d/%d/%d", getMonth(), getDay(), getYear());
    }
}