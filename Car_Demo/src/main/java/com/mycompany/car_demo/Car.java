package com.mycompany.car_demo;

public class Car {
    public String carBrand = "";
    public int carSpeed = 0;
    
    public void start() {
        System.out.println("The Car has started");
    }
    
    public void accelerate(){
        carSpeed = carSpeed + 10;
        System.out.println("The car is driving at " + carSpeed + "km/h");
    }
}

/*
QUESTION
 
• Create a program using two classes called Car and Main.
 
• The Car class should represent a car and contain the following: 
 
• Variables:
 
• brand to store the car brand
 
• speed to store the current speed of the car
 
• Methods:
 
• start() → should display the message "The car has started."
 
• accelerate() → should increase the speed by 10 and display the new speed
 
• The Main class should:
 
• Create an object of the Car class called myCar
 
• Set the car brand to "Toyota" 
 
• Set the initial speed to 0
 
• Call the start () method
 
• Call the accelerate () method twice
*/