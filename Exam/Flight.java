package Exam;

import java.util.Scanner;

public class Flight {
    // The private instance variable
    private int number;
    private String destination;

    // Constructs a Flight instance with the given inputs
    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    // The public getters and setters for the private instance variables.
    public int getNumber() {
        return number;
    }
    public String getDestination() {
        return destination;
    }
    public void setNumber() {
        this.number = number;
    }
    public void setDestination() {
        this.destination = destination;
    }
    public void InputFlight() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number flight: ");
            number = scanner.nextInt();
        } while (number <= 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your destination: ");
        destination = scanner.nextLine();
    }
    public void displayFlight() {
        System.out.println("Your number flight is: " + number);
        System.out.println("Your destination is: " + destination);
    }
}
