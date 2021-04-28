package Exam;

import java.util.Scanner;

public class Bank {
    // The private instance variable
   private double balance;
   private double rate;
   private double Interest;

    // Constructs a Bank instance with the given inputs
    public Bank(double balance, double rate, double Interest) {
        this.balance = balance;
        this.rate = rate;
        this.Interest = Interest;
    }

    // The public getters and setters for the private instance variables.
    public double getBalance() {
        return balance;
    }
    public double getRate() {
        return rate;
    }
    public double getInterest() {
        return Interest;
    }
    public void setBalance() {
        this.balance = balance;
    }
    public void setRate() {
        this.rate = rate;
    }
    public void setInterest() {
        this.Interest = Interest;
    }
    public void InputBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount to borrow: ");
        balance = scanner.nextDouble();
        System.out.println("Enter a rate you want: ");
        rate = scanner.nextDouble();
    }
    public void calculateInternest() {
        Interest = balance * (rate/1200);
        System.out.println("Amount you have to pay monthly: " + Interest);
    }
}
