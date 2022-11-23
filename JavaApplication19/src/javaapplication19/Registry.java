/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class Registry{
    private HashMap<String,Dress> registry;
    
    public Registry(){
        registry = new HashMap();
        initialize();
    }

    private void initialize() {
        Dress tshirt = new Tshirt();
        registry.put("Tshirt", tshirt);
        
        Dress denim = new Denim();
        registry.put("Denim", denim);
    }
    
    public Dress getclone (String dresstype){
        Object clone = null;
        try{
            clone = registry.get(dresstype).clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (Dress) clone;
    }
}
