/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

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
        GetPlanFactory PlanFactory = new GetPlanFactory();
        String planName = "domesticPlan";
        Plan p = PlanFactory.getPlan(planName);
        int units = 6;
        
        System.out.print("Bill amount for"+planName+"of"+units+"units is :");
        p.getRate();
        p.calculateBill(units);
    }
    
}
