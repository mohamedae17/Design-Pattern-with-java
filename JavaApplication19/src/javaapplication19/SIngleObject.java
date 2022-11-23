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
    private static SIngleObject instance = new SIngleObject();
    
    private SIngleObject(){}
    
    public static SIngleObject getInstance(){
        return instance;
    }
    
    public void showmessage(){
        System.out.println("Single obj");
    }
}
