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
        Registry reg = new Registry();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your order type :");
        String type = sc.next();
        System.out.println("Enter our quantity :");
        int quantity = sc.nextInt();
        
        Dress order = reg.getclone(type);
        order.setQuantity(quantity);
        
        System.out.println("Your order is : "+order.getQuantity()+" "+order.getClass().getSimpleName());
        System.out.println("The unit price of a : "+order.toString()+" is "+order.getPrice()+"EGP");
        System.out.println("Your total price is : "+order.calculateBill()+"EGP");

    }
    
}
