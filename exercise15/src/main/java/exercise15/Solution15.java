package exercise15;
import java.util.Scanner;
/*
    Ask User:
    What's the password?
        if(password.equals("UcF")
            print out: Welcome!
        else
            print out: I don't know you..
 */
public class Solution15 {
    public static void main(String[] args) {
        System.out.print("What is the password?: ");
            Scanner input = new Scanner(System.in);
            String password = input.next();

        if(password.equals("UcF"))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you..");


    }
}
