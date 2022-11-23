/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class Cashier {
    Builder buider;
    
    public Cashier(Builder builder){
        this.buider = builder;
    }
    
    public void orderMeal(){
        buider.buildMealMainDish();
        buider.buildFries();
        buider.buildDrink();
    }
    
    public Meal getOrderedMeal(){
        return buider.buildMealObject();
    }
}
