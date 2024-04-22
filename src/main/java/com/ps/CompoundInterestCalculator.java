package com.ps;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount, interest rate, number of years, and compounding frequency
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the compounding frequency per year: ");
        int compoundingFrequency = scanner.nextInt();

        // Calculate future value
        double futureValue = calculateFutureValue(principal, interestRate, years, compoundingFrequency);

        // Display the result
        System.out.println("The future value of your investment is: $" + futureValue);

        scanner.close();
    }

    public static double calculateFutureValue(double principal, double interestRate, int years, int compoundingFrequency) {
        double ratePerPeriod = interestRate / compoundingFrequency;
        int numberOfPeriods = compoundingFrequency * years;
        return principal * Math.pow(1 + ratePerPeriod, numberOfPeriods);
    }
}
