package com.ps;
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner ( System.in );

        // Principal
        System.out.print("Principal:");
        int principal = stdin.nextInt();
        // Interest rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = stdin.nextFloat();
        float monthlyInterest = annualInterest / 100 / 12;
        // Period (max = 30)
        System.out.print("Period (Years): ");
        byte years = stdin.nextByte();
        int numberOfPayments = years * 12;

        // Calculate the monthly payment
        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);

        double monthlyPayment = principal * (monthlyInterest * mathPower / (mathPower - 1));

        // NumberFormat;
        // String monthlyPaymentFormatted = number-format.getCurrencyInstance().format(monthlyPayment);

        // Print the result
        // System.out.print("Your monthly payment is: " + monthlyPaymentFormatted);
    }



}
        /*
        public static void aMortgageCalculator(Scanner stdin){
        // Principal
        System.out.print("Principal:");
        int principal = stdin.nextInt();
        // Interest rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = stdin.nextFloat();
        // Period (max = 30)
        System.out.print("Period (Years): ");
        byte years = stdin.nextByte();

         // Calculations
         float monthlyInterest = annualInterest / 100 / 12;
         int numberOfPayments = years * 12;
        // Calculate monthly payment
        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);

        double monthlyPayment = (principal * monthlyInterest) / (1- Math.pow(1 + monthlyInterest, -number0fPayments));
        double totalPayment + (monthlyPayment * number0fPayments);
        double totalInterest = (totalPayment - principal);

        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);

        // Print the result
        System.out.print("Your monthly payment is: " + monthlyPaymentFormatted);
        */


