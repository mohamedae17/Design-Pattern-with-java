/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class KidsMealBuilder extends Builder{

    @Override
    void buildMealMainDish() {
        constructionObject.setMainDDish("Kids Burger");
    }

    @Override
    void buildFries() {
        constructionObject.setFries("Duck Shape fries");
    }

    @Override
    void buildDrink() {
        constructionObject.setDrink("Orange Juice");
    }

    @Override
    Meal buildMealObject() {
        return constructionObject;
    }
    
    
    
}
