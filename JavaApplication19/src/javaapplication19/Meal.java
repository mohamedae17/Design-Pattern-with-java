/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class Meal {
    public String mainDDish;
    public String Fries;
    public String Drink;
    
        public void setMainDDish(String mainDDish) {
        this.mainDDish = mainDDish;
    }

    public void setFries(String Fries) {
        this.Fries = Fries;
    }

    public void setDrink(String Drink) {
        this.Drink = Drink;
    }

    @Override
    public String toString() {
        return "mainDish : "+mainDDish+", fries :"+Fries+", Drink :"+Drink+"\n";
    }
    
}
