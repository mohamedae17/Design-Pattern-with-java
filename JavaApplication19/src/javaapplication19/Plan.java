/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public abstract class Plan {
    protected double rate;
    public abstract void getRate();
    public void calculateBill(int unit){
        System.out.println(unit*rate);
    }
}
