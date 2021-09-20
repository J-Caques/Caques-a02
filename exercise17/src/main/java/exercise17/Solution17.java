package exercise17;
import java.util.Scanner;
/*
    Ask User:
    Are you male/female? Ounces of alcohol drank? Weight? Hours since last Drink?
    Use BAC formula, doing one for men (0.73) and one for woman (0.66):
    BAC = (alcConsumed * 5.14 / weight * ratio) - .015 * Hours
    Display user's BAC:
       If BAC >= to 0.08, output: "Not legal for you to drive."
        else: It's legal for you to drive."
 */
public class Solution17 {
    public static void main(String[] args) {
        System.out.print("Are you male (1) or female (2)?: ");
            Scanner input1 = new Scanner(System.in);
            int gender = input1.nextInt();


        System.out.print("How much alcohol did you have?(fl. oz.): ");
            Scanner input2 = new Scanner(System.in);
            int alcohol = input2.nextInt();

        System.out.print("What is your weight?(lbs): ");
            Scanner input3 = new Scanner(System.in);
            double weight = input3.nextFloat();

        System.out.print("How many hours since your last drink?: ");
            Scanner input4 = new Scanner(System.in);
            int hours = input4.nextInt();

         double BAC;

        if (gender == 1){
            BAC = ((alcohol*5.14)/(weight * 0.73)) - (0.15 * hours);
        }
        else {
            BAC = ((alcohol*5.14)/(weight * 0.66)) - (0.15 * hours);
        }

        String output = BAC >= 0.08 ? "It isn't legal for you to drive." : "It's legal for you to drive.";

        System.out.printf("Your BAC is %.6f %n%s", BAC, output);
    }
}
