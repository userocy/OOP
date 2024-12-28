/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class PieceWorkerEmployee extends Employee{

    private int totalPiecesFinished;
    private double ratePerPiece;


    public PieceWorkerEmployee() {
        super();
    }

    public PieceWorkerEmployee(int empID, Name empName) {
        super(empID, empName.getFName(), empName.getMName(), empName.getLName());
    }

    public PieceWorkerEmployee(Name empName, int empID) {
        super(empID, empName.getFName(), empName.getMName(), empName.getLName());
    }

    public PieceWorkerEmployee(double ratePerPiece, int totalPiecesFinished) {
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public PieceWorkerEmployee(int empID, Name empName, int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName.getFName(), empName.getMName(), empName.getLName());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }


    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }



    public double computeSalary() {
        return totalPiecesFinished * ratePerPiece + ((int) totalPiecesFinished / 100) * (10 * ratePerPiece);
    }


    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Total pieces finished: ").append(getTotalPiecesFinished()).append("\n");
        sb.append("Rate per piece").append(getRatePerPiece()).append("\n");
        sb.append("Salary: $").append(computeSalary());


        return sb.toString();
    }
}