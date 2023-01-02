/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import Prototype.EmployeeRecord;
import Singelton.Counter;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int empID = 100;
        String empName = "Ahmed";
        String empAdd = "cairo";
        double empSalary = 1000;
        
        EmployeeRecord Emp1 = new EmployeeRecord(empID,empName,empSalary,empAdd);
        
        Emp1.showRecord();
        System.out.println("\n");
        EmployeeRecord Emp2 = (EmployeeRecord) Emp1.getClone();
        Emp2.showRecord();
    }
    
}
