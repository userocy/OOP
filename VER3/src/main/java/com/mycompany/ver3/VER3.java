/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class VER3 {

        public static void main(String[] args) {
    Name n1 = new Name();
    Name n2 = new Name("Oceane Rim");
    Name n3 = new Name("Oceane Rim", "Michael Gomez");
    Name n4 = new Name("Oceane Rim", "Michael Gomez", "Cahiles");
    Name n5 = new Name();

    n1.setFName("Jennifer");
    n1.setLName("Prefer");
    n1.setMName("Play");

    n2.setMName("Cahiles");
    n2.setFName("Michael Gomez");

    n3.setMName("Cahiles");

    n5.setName("Oceane Rim", "Jan", "Curimatmat");

    n1.displayName();
    n2.displayName();
    n3.displayName();
    n4.displayName();
    n5.displayName();

    MyDate d1 = new MyDate();
    MyDate d2 = new MyDate(2003);
    MyDate d3 = new MyDate(2002, 12);
    MyDate d4 = new MyDate(2, 12, 2006);
    MyDate d5 = new MyDate();

    System.out.println("\n");

    d1.setDay(25);
    d1.setMonth(6);
    d1.setYear(2003);

    d2.setDay(24);
    d2.setMonth(7);

    d3.setDay(30);

    d5.setMyDate(2012, 2, 21);

    d1.display();
    d2.display();
    d3.display();
    d4.display();
    d5.display();

    Employee e1 = new Employee();
    Employee e2 = new Employee(1);
    Employee e3 = new Employee(2, "Michael Gomez", "Oceane Rim");
    Employee e4 = new Employee(3, "Christian", "Oceane Rim", "Cahiles");
    Employee e5 = new Employee(5, "Jackie Chan", "Onikawa");

    System.out.println("\n");

    e1.setEmpID(9);
    e1.setEmpName("Jan", "Appari", "Oceane Rim");
    e1.setEmpDateBirth(2002, 7, 21);
    e1.setEmpDateHired(2024, 9, 12);

    e2.setEmpName("Hiroshi", "Gab", "Curimatmat");
    e2.setEmpDateBirth(2003, 1, 5);
    e2.setEmpDateHired(2022, 9, 15);
    
    e3.setEmpDateBirth(2000, 12, 25);
    e3.setEmpDateHired(2021, 2, 27);

    e4.setEmpDateBirth(1999, 6, 8);
    e4.setEmpDateHired(2023, 11, 18);

    e1.displayEmployee();
    e2.displayEmployee();
    e3.displayEmployee();
    e4.displayEmployee();
    e5.displayEmployee();
}

}
