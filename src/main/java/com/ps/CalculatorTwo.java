package com.ps;

import java.util.Scanner;
public class CalculatorTwo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your deposit amount: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter your interest rate: ");
        deposit = scanner.nextDouble();

        System.out.print("Enter term years for account:");
        int years = scanner.nextInt();

        double interestRate = 0;
        double dailyInterestRate = interestRate / 100 / 365;
        int number0fDays = years * 365;

        double futureCdRate = cdFormula( deposit,dailyInterestRate, number0fDays);
        double totalInterestEarned = futureCdRate - deposit;

        System.out.printf("If you deposit $%.2f in a CD that earns %2f%% interest and matures in %d years,\n", deposit, interestRate);
                System.out.printf("Your CD's ending balance will be $%.2f, and you would have earned $%.2f in interest.\n");

    }
    public static double cdFormula(double deposit, double dailyInterestRate, int number0fDays ){
        return deposit * Math.pow(1 + dailyInterestRate , number0fDays);
    }
}
