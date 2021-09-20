package exercise07;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
        "What is the length/width of the room in ft?"
        Use scanners to save user input
        int l = input1.nextInt() int w = input.nextInt()
        "You entered dimensions x by y"
        areaFt = w * l
        areaM = areaFt * conversionFactor
        The area is
        areaFT
        areaM
     */
public class Solution07 {
    public static void main(String[] args) {
        System.out.println("What is the length of the room in feet?");

        Scanner input = new Scanner(System.in);
        int l = input.nextInt();

        System.out.println("What is the width of the room in feet?");

        Scanner input2 = new Scanner(System.in);
        int w = input2.nextInt();

        System.out.printf("You entered the dimensions %d feet by %d feet%n", l, w);

        int areaFt = w * l;
        
        String aFt = areaFt + " square feet";

        double conversionFactor = 0.09290304;

        double areaM = areaFt * conversionFactor;
        BigDecimal area_M = new BigDecimal(Double.toString(areaM));
        area_M = area_M.setScale(3, RoundingMode.CEILING);

        String aM = area_M + " square meters";

        System.out.printf("The area is %n%s%n%s", aFt, aM);
    }

}
