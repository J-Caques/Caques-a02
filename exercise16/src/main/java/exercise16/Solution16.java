package exercise16;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User:
    What is your age?
    Using ternary operator:
     String output = age >=16 ? "You are old enough to drive." : "You are not old enough to drive.";
 */
public class Solution16 {
    public static void main(String[] args) {

        System.out.print("What is your age?: ");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();

        String output = age >= 16 ? "You are old enough to drive." : "You are not old enough to drive.";

        System.out.printf("%s",output);
    }
}
