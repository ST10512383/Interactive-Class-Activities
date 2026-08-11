package com.mycompany.oopdemo2;

public class Rect {
    private double length;
    private double width;
    
    // Default argument
    public Rect() {  
    }
    
    public Rect(double len, double wid){
        length = len;
        width = wid;
    }
    
    // Getter
    public double getLength() {
        return length;
    }
    
    // Setter
    public void setLength(double len) {
        length = len;
    }
    
    // Getter
    public double getWidth() {
        return width;
    }
    
    // Setter
    public void setWidth(double wid) {
        width = wid;
    }
    
    // Calculate perimeter and return it
    public double calcPerimeter() {
        return 2 * (length + width);
    }
    
    // Calculate area and return it
    public double calcArea() {
        return length * width;
    }
    
    // Concatenate a string and return with its string and values
    public String toString() {
        return "Length is: " + length + " Width is: " + width;
    }
}
