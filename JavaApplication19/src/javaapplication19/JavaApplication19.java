/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

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
        Counter objA = Counter.getInstance();
        objA.addone();
        Counter objB = Counter.getInstance();
        objB.addone();
        objB.addone();
        System.out.println("Counter A is " + objA.counter);
        System.out.println("Counter B is " + objB.counter);
    }
    
}
