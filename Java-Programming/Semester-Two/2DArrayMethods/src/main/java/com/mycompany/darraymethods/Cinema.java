package com.mycompany.darraymethods;

public class Cinema {

    public char[][] creatingSeatingPlan() {

        char[][] seats = {
            {'A', 'B', 'A', 'A'},
            {'B', 'B', 'A', 'A'},
            {'A', 'A', 'A', 'B'},};

        return seats;
    }

    public int countBookedSeats(char[][] seats) {

        int booked = 0; // accumulator variable

        for (int row = 0; row < seats.length; row++) { // outer loop body
            for (int column = 0; column < seats[row].length; column++) { // inner loop
                if (seats[row][column] == 'B') {
                    booked++; // Add to the tally of booked seats by a value of 1
                }
            }
        }
        return booked;
    }

    public void displaySeatingPlan(char[][] seats) {
        System.out.println("Cinema Seating Plan");
        System.out.println("-------------------");
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                System.out.print(seats[row][column] + " ");
            }
        }
        System.out.println();
    }
}
