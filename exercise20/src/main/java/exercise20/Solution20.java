package exercise20;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/* Ask User:
    What is the order Amount?:
    What State do you live in?:
        if WI:
            What County do you live in?:
                if Eau Claire, an added 0.005 tax to WI's 5% tax rate (0.055)
                    else if Dunn, an added 0.004 tax (0.054)
        if IL, an 8% sales tax (0.08)
            else, no sales tax for other states

   Calculate:
   Total = Subtotal * (1 + sales tax)
   Output: The tax is $X.XX.  The Total is $X.XX.
 */

public class Solution20 {
    public static void main(String[] args) {
        System.out.print("What is the order amount?: ");
            Scanner input1 = new Scanner(System.in);
            double amount = input1.nextDouble();

        System.out.print("What State do you live in?: ");
            Scanner input2 = new Scanner(System.in);
            String state = input2.next();

        double salesTax = 0;

        if (state.equals("Wisconsin")){
            System.out.print("What county do you live in?: ");
            Scanner input3 = new Scanner(System.in);
            String county = input3.nextLine();

            if(county.equals("Eau Claire")){
                salesTax = 0.055;
            }
            else if (county.equals("Dunn")){
                salesTax = 0.054;
            }
        }
        else if (state.equals("Illinois")){
            salesTax = 0.08;
        }

        double tax = amount * salesTax;
        double total = amount * (1 + salesTax);

        System.out.printf("The tax is $%.2f. %nThe total is $%.2f.", tax, total);

    }
}
