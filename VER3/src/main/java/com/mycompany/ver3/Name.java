/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class Name  {

    private String fName;
    private String mName;
    private String lName;


    public Name(){

    }

    public Name(String lName) {
        this.lName = lName;
    }

    public Name(String lName, String fName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Name(String lName, String fName, String mName) {
        this.lName = lName;
        this.fName = fName;
        this.mName = mName;
    }

    public void setName(String lName, String fName, String mName) {
        this.lName = lName;
        this.fName = fName;
        this.mName = mName;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public String getFName(){
        return fName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getMName() {
        return mName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getLName() {
        return lName;
    }

    public char getMnameInitial() {
        return mName.charAt(0);
    }

    public void displayName() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getFName()).append(" ");
        sb.append((getMName() == null) ? " " : getMnameInitial() + ". ");
        sb.append(getLName());

        return sb.toString();
    }


}