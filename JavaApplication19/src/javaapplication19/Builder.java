/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public abstract class Builder {
    Meal constructionObject;
    
    public Builder(){
        constructionObject=new Meal();
    }
    
    abstract void buildMealMainDish();
    abstract void buildFries();
    abstract void buildDrink();
    abstract Meal buildMealObject();
}
