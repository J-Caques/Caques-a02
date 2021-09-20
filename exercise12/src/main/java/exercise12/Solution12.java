package exercise12;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User:
    Enter the Principal; Rate of interest; Number of years;
    Convert Rate from percentage to decimal: rate/100
    Use simple interest formula : Accrued = Principal(1+(rate*time))
    After X years at Y%, the investment is $Accrued.
 */
public class Solution12 {
    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
            Scanner input1 = new Scanner(System.in);
            int principal = input1.nextInt();

        System.out.print("Enter the rate of interest(%): ");
            Scanner input2 = new Scanner(System.in);
            float interest = input2.nextFloat();

        System.out.print("Enter the number of years: ");
            Scanner input3 = new Scanner(System.in);
            int years = input3.nextInt();

        float rate = interest / 100;
        double accrued = principal*(1+(rate*years));
        String interestRate = interest + "%";

        double y =(accrued * 100) + 0.5;
        int x = (int)Math.ceil( y);
        double a = x / 100d;

        System.out.printf("After %d years at %s , the investment will be worth $%.2f.", years, interestRate, a);



    }
}
