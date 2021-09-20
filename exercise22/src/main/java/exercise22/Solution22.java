package exercise22;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask User:
    Enter the first number; the second; the third
    If the three are equal, exit program
     else, determine which is the largest of the three
           using an array and a for loop
    Output:
    The largest number is X.
 */

public class Solution22 {
    public static void main(String[] args) {

        int[] array = new int[4];
        System.out.print("Enter the first number: ");
            Scanner input1 = new Scanner(System.in);
            int x = input1.nextInt();
            array[0] = x;

        System.out.print("Enter the second number: ");
            Scanner input2 = new Scanner(System.in);
            int y = input2.nextInt();
            array[1] = y;

        System.out.print("Enter the third number: ");
            Scanner input3 = new Scanner(System.in);
            int z = input3.nextInt();
            array[2] = z;



        if (x == y && y == z){
            System.exit(0);
        }
        else{
            for(int i = 0; i < 2; i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
          int largest = array[2];
          System.out.printf("The largest number is %d.", largest);
        }

    }
}
