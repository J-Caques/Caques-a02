package exercise18;
import java.util.Scanner;


/*
    Ask User:
    Press C to convert from Fahrenheit to Celsius; Press F to convert from Celsius to Fahrenheit
    Your choice: X

    If C ask for temp. in F; else, ask for temp. in C.

    Use Formulas to Convert:
    C = ((F-32) * 5) / 9
    F = (C*9/5) + 32

    Output: The temperature in Fahrenheit/Celsius is X.
 */

public class Solution18 {
    public static void main(String[] args) {
        System.out.printf("Press C to convert from Fahrenheit to Celsius %nPress F to convert Celsius to Fahrenheit%n");
            Scanner input1 = new Scanner(System.in);
            String option = input1.next().toUpperCase();


        System.out.printf("Your choice was: %s %n", option);

        String output = option.equals("C") ? "Enter the temperature in Fahrenheit: " : "Enter the temperature in Celsius: ";
        System.out.printf("%s", output);
        Scanner input2 = new Scanner(System.in);

        if(option.equals("C")){
            int fhrn = input2.nextInt();

            int cls = ((fhrn-32)*5)/9;
            System.out.printf("The temperature in Celsius is %d.", cls);
        }
        else {
            int cls = input2.nextInt();

            int fhrn = ((cls * 9) / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %d.", fhrn);
        }
    }
}
