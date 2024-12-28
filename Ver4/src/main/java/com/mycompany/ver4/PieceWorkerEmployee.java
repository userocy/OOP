/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver4;

/**
 *
 * @author Oceane
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        super();
    }

    public PieceWorkerEmployee(int empID, Name empName) {
        super(empID, empName.getFname(), empName.getMname(), empName.getLname());
    }

    public PieceWorkerEmployee(Name empName, int empID) {
        super(empID, empName.getFname(), empName.getMname(), empName.getLname());
    }

    public PieceWorkerEmployee(double ratePerPiece, int totalPiecesFinished) {
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public PieceWorkerEmployee(int empID, Name empName, int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName.getFname(), empName.getMname(), empName.getLname());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void setFinishedPieces (int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public int getFinishedPieces () {
        return this.totalPiecesFinished;
    }

    public void setRate (double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double getRate() {
        return this.ratePerPiece;
    }

    public double computeSalary() {
        return totalPiecesFinished * ratePerPiece + ((int) totalPiecesFinished / 100) * (10 * ratePerPiece);
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append(super.toString())
            .append("Total hours worked: ").append(getFinishedPieces()).append("\n")
            .append("Rate per hour: ").append(getRate()).append("\n");
        return sb.toString();
    }
}