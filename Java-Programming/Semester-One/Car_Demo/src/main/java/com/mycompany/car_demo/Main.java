package com.mycompany.car_demo;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.carBrand = "Toyota";
        myCar.carSpeed = 0;
        
        myCar.start();
        myCar.accelerate();
        myCar.accelerate();
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