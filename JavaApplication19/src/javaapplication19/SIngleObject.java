/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class SIngleObject {
    private static SIngleObject instance;
    
    private SIngleObject(){}
    
    public static SIngleObject getInstance(){
              if(instance == null)
        {
           instance = new SIngleObject();
        }

        return instance;
    }
    
    public void showmessage(){
        System.out.println("Single obj");
    }
}
