package exercise21;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User:
    Enter the number of the month:
    Using Switch/ case statement for the 12 months
    Output:
    The name of the month is X.
 */

public class Solution21 {
    public static void main(String[] args) {
        System.out.print("Enter the number of the month: ");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            String month = null;

        switch (x){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        System.out.printf("The name of the month is %s.", month);

    }
}

