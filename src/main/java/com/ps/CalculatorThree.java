package com.ps;

import java.util.Scanner;

public class CalculatorThree {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for monthly payout, interest rate, and years
        System.out.print("Enter the monthly payout: $");
        double monthlyPayout = scanner.nextDouble();

        System.out.print("Enter the expected annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate present value of annuity
        double presentValue = calculatePresentValue(monthlyPayout, annualInterestRate, years);

        // Display the result
        System.out.println("The present value of the annuity is: $" + presentValue);

        // Close the scanner
        scanner.close();
    }

    public static double calculatePresentValue(double monthlyPayout, double annualInterestRate, int years) {
        // Convert annual interest rate to monthly rate
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        // Calculate total number of payments
        int totalPayments = years * 12;

        // Calculate present value using the annuity formula
        double presentValue = monthlyPayout * ((1 - Math.pow(1 + monthlyInterestRate, -totalPayments)) / monthlyInterestRate);

        return presentValue;
    }
}


