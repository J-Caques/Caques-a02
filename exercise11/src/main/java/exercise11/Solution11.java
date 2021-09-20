package exercise11;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User: How many Euros are you exchanging? What is the exchange rate?
    Reiterate: X Euros at an exchange rate y.
    Convert to USD: Rate * Euros = USD
    Output: Z USD
 */
public class Solution11 {
    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        Scanner input1 = new Scanner(System.in);
        int euros = input1.nextInt();

        System.out.println("What is the exchange rate?");
        Scanner input2 = new Scanner(System.in);
        float rate = input2.nextFloat();

        float dollar  = rate * euros;
        double USD = Math.ceil(dollar * 100) /100;

        System.out.printf("%d euros at exchange rate of %.4f is%n%.2f USD.", euros, rate, USD);
    }
}
