/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class BigMacMealBuilder extends Builder{
        @Override
    void buildMealMainDish() {
        constructionObject.setMainDDish("Big Mac Burger");
    }

    @Override
    void buildFries() {
        constructionObject.setFries("fries");
    }

    @Override
    void buildDrink() {
        constructionObject.setDrink("Cola");
    }

    @Override
    Meal buildMealObject() {
        return constructionObject;
    }
}
