package com.mycompany.darraymethods;

public class main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        
        // Receive the 2D array from a method
        char[][] seatingPlan = cinema.creatingSeatingPlan();
        
        // Pass the 2D array to the methods
        cinema.displaySeatingPlan(seatingPlan);
        int bookedSeats = cinema.countBookedSeats(seatingPlan);
        
        System.out.println("\nBooked Seats: " + bookedSeats);
    }
}
