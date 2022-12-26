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
        int x1 = 10 , y1 = 20;
        int x2 = 30 , y2 = 60;
        
        Shape shape = new RecAdapter(new LegacyRectangle());
        shape.draw(x1, y1, x2, y2);
    }
    
}
