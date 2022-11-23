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
        Builder b = new BigMacMealBuilder();
        Cashier macCashier = new Cashier(b);
        
        macCashier.orderMeal();
        System.out.println(macCashier.getOrderedMeal().toString());
    }
    
}
