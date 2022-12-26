/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class RecAdapter implements Shape{
    private final LegacyRectangle adaptee;
    public RecAdapter(LegacyRectangle adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        adaptee.draw(x, y, width, height);
    }
    
}
