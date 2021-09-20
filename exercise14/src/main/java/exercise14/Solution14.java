package exercise14;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User:
    What is the order amount? What is the state?
    Output:
        Subtotal: $xx.xx
    If State == WI (Wisconsin), charge a 5.5% tax.
    Output:
        The tax is $(rate*subtotal).
        Total is $(Subtotal + tax)
    Otherwise for non-WI residents, just display:
        Total is $(order amount).
 */
public class Solution14 {
    public static void main(String[] args) {
        System.out.print("What is the order amount?: " );
            Scanner input1 = new Scanner(System.in);
            float amount = input1.nextInt();

        System.out.print("What is the state(initials)?: ");
            Scanner input2 = new Scanner(System.in);
            String state = input2.next();

        float total = amount;
        if ( state.equals("WI") ){
            double tax_rate =  (5.5 / 100);
            float t = (float) (amount * tax_rate);

                double y =(t * 1000) + 0.5;
                int x = (int)Math.ceil( y);
                double tax = x / 1000d;

             total = (float) (amount + tax);


            System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%n", amount, tax);

        }

        System.out.printf("The total is $%.2f.", total);

    }
}
