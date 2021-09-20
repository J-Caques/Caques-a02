package exercise08;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

/*
    Ask: How many People? Pizzas? Slices per Pizza?
    Save inputs using scanners
    Reiterate # of people & pizzas (w/ total # of slices)
    Calculate: slicesPerPerson = ttlSlices/people; check if even (slicesPerPerson % 2 = 0)
    If slicesPerPerson % 2 != 0, leftovers = slicesPerPerson % people
 */
public class Solution08 {
    public static void main(String[] args) {

        System.out.println("How many people are there?");
        Scanner input1 = new Scanner(System.in);
        int people = input1.nextInt();

        System.out.println("How many pizzas?");
        Scanner input2 = new Scanner(System.in);
        int pizzas = input2.nextInt();

        System.out.println("How many slices per pizza?");
        Scanner input3 = new Scanner(System.in);
        int slices = input3.nextInt();

        int ttlSlices = pizzas * slices;

        System.out.printf("%d people with %d pizzas (%d slices)%n", people, pizzas, ttlSlices);

        int leftovers = 0;
        int slicesPerPerson = ttlSlices/people;
            if (slicesPerPerson % 2 != 0){
                leftovers = ttlSlices % people;
            }


        System.out.printf("Each person gets %d pieces per pizza.%nThere are %d leftover pieces.", slicesPerPerson, leftovers);
    }
}
