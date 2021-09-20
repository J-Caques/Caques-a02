package exercise13;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User:
    What is the principal Amount? Interest rate? Number of Years? The n times interest compounded in a year?
    Save user input using a scanner.
    Use Compound Interest Formula:
    Accrued = Principal(1 + rate/n) ^ (n/time)
    Output:
    X invested at Y% for Z years compounded n times per year is $Accrued.

 */
public class Solution13 {
    public static void main(String[] args) {
        System.out.print("What is the principal amount?: ");
            Scanner input1 = new Scanner(System.in);
            int principal = input1.nextInt();

        System.out.print("What is the interest rate(%)?: ");
            Scanner input2 = new Scanner(System.in);
            double rate = input2.nextDouble();

        System.out.print("What is the number of years?: ");
            Scanner input3 = new Scanner(System.in);
            int years = input3.nextInt();

        System.out.print("What is the number of times the interest is compounded per year?: ");
            Scanner input4 = new Scanner(System.in);
            int n = input4.nextInt();

        double interest = rate / 100;
        double x = Math.pow((1+(interest/n)), (n*years));
        double accrued = principal * x;

        String interestRate = rate + "%";


        System.out.printf("$%d invested at %s for %d years compounded %d times per year is $%.2f.", principal, interestRate, years, n, accrued);
    }
}
