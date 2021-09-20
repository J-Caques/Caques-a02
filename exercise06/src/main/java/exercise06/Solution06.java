package exercise06;
import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
   Prompt user "What is your age?" & "What age would you like to retire"
   Save user input through scanners
   Calculate the difference & then add it to current year
   retiredAge-currentAge = difference
   Get current year using imported Calender class
   currentYear + difference = retirementYear
   Output to the user:
   "It's "currentYear", you'll retire in the year "retirementYear";
 */

public class Solution06 {
    public static void main(String[] args) {
        System.out.println("What is your age?");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        System.out.println("What age would you like to retire?");

        Scanner input2 = new Scanner(System.in);
        int retireAge = input2.nextInt();

        int difference = retireAge - age;

        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int retirementYear = currentYear + difference;

        System.out.printf("It is %d, you'll retire in the year %d", currentYear, retirementYear);


    }

}
