/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singelton;

/**
 *
 * @author DELL
 */
public class Counter {
    public int counter = 0;
    private static Counter instance = null;
    private Counter(){}
    public static Counter getInstance(){
        if(instance == null) instance = new Counter();
        return instance;
    }
    public void addone(){
        counter = counter+1;
    }
}
