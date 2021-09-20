package exercise19;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
   Ask User:
   What is your weight? Height?

   Use BMI formula:
   bmi = (weight/(height^2))* 703

   If bmi <= 25 && >= 18.5 : "You are in the ideal range.".
        else if bmi < 18.5 : "You are underweight, consult a doctor."
            else bmi > 25 : "You are overweight, consult a doctor."
 */

public class Solution19 {
    public static void main(String[] args) {

        System.out.print("What is your weight(lbs)?: ");
            Scanner input1 = new Scanner(System.in);
            float weight = input1.nextFloat();

        System.out.print("What is your height(inch)?: ");
            Scanner input2 = new Scanner(System.in);
            int height = input2.nextInt();

        float bmi = (weight/(height*height)) * 703;
        String output;

        if(bmi <= 25 && bmi >=18.5){
            output = "You are in the ideal range.";
        }
        else if (bmi > 25){
             output = "You are overweight, consult your doctor.";
        }
        else {
             output = "You are underweight, consult your doctor.";
        }
        System.out.printf("Your BMI is %.1f. %n%s", bmi, output);
    }
}
