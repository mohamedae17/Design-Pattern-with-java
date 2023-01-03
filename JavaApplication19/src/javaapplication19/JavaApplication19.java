/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import Prototype.EmployeeRecord;
import Proxy.Image;
import Proxy.ProxyImage;
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
        Image image = new ProxyImage("test_1omb.jpg");
        image.display();
        System.out.println();
        image.display();
    }
    
}
