package exercise09;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask: What is the length of the ceiling? the width?
    Use scanners to save user input
    Area = l * w
    galOfPaint = 350
    gallonsNeeded = Area/galofPaint
    If Area % galofPaint != 0, then round gallonsNeeded to next whole number
    Prompt: You will need "gallonsNeeded" of paint to cover "area".

 */

public class Solution09 {
    public static void main(String[] args) {
        System.out.println("What is the length of your ceiling?");
        Scanner input1 = new Scanner(System.in);
        int l = input1.nextInt();

        System.out.println("What is the width of your ceiling?");
        Scanner input2 = new Scanner(System.in);
        int w = input2.nextInt();

        int area = l * w;
        float galOfPaint = 350;
        float gallonsNeeded = area/galOfPaint;


        int gallons_Needed = (int) Math.ceil(gallonsNeeded);



        System.out.printf("You'll need %d gallons of paint to cover %d square feet.", gallons_Needed, area);
    }
}
