package exercise10;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Create a for loop
    Ask: What's the price of the item? What's the quantity?
    Calculate subtotal;
    Display tax (subtotal * taxrate (5.5%) )
    Display total (subtotal + tax)
 */
public class Solution10 {
    public static void main(String[] args) {
        System.out.print("Enter the price of item 1: ");
            Scanner input1 = new Scanner(System.in);
            int item1 = input1.nextInt();

        System.out.print("Enter the quantity of item 1: ");
            Scanner inputq1 = new Scanner(System.in);
            int quant1 = inputq1.nextInt();

        System.out.print("Enter the price of item 2: ");
            Scanner input2 = new Scanner(System.in);
            int item2 = input2.nextInt();

        System.out.print("Enter the quantity of item 2: ");
            Scanner inputq2 = new Scanner(System.in);
            int quant2 = inputq2.nextInt();

        System.out.print("Enter the price of item 3: ");
            Scanner input3 = new Scanner(System.in);
            int item3 = input3.nextInt();

        System.out.print("Enter the quantity of item 3: ");
            Scanner inputq3 = new Scanner(System.in);
            int quant3 = inputq3.nextInt();

        int itemOne = item1 * quant1;
        int itemTwo = item2 * quant2;
        int itemThree = item3 * quant3;

        double subTotal = itemOne + itemTwo + itemThree;
        double taxRate = 0.055;
        double tax = subTotal * taxRate;
        double total = subTotal + tax;

        String subTtl =  "Subtotal: $" + String.format("%.2f", subTotal);
        String tx = "Tax: $" + String.format("%.2f", tax);;
        String ttl = "Total: $" + String.format("%.2f", total);;

        System.out.printf("%s%n%s%n%s", subTtl, tx, ttl);
    }
}
