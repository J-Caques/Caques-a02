package exercise23;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */


/*
    Prompt user a series of troubleshooting question to help determine the cause of a ticking sound
    Use nested if statements
 */

public class Solution23 {
    public static void main(String[] args) {
        System.out.println("You hear a ticking sound when the car is running.");
        System.out.print("Is it a clunk (y) or a single tick?(n): ");
        Scanner input = new Scanner(System.in);
        String response = input.next();

        if (response.equals("y")) {
            System.out.print("Is the noise on bumps only?(y/n): ");
            Scanner input2 = new Scanner(System.in);
            response = input2.next();
            if (response.equals("y")) {
                System.out.print("Check struts, shocks, springs, and frame welds");
            } else if (response.equals("n")) {
                System.out.print("Check ball joints, rack and tie rod ends, and motor mounts.");
            }
        } else if (response.equals("n")) {
            System.out.print("Only ticks when moving?(y/n): ");
            Scanner input3 = new Scanner(System.in);
            response = input3.next();
            if (response.equals("y")) {
                System.out.print("Ticks when rolling in neutral?(y/n): ");
                Scanner input4 = new Scanner(System.in);
                response = input4.next();
                if (response.equals("y")) {
                    System.out.print("Frequency drops on shifts?(y/n): ");
                    Scanner input5 = new Scanner(System.in);
                    response = input5.next();
                    if (response.equals("y")) {
                        System.out.printf("Try to localize tick with a hearing tube or long screwdriver (listen at handle) %n");
                        System.out.print("Does it only tick when it's cold?(y/n): ");
                        Scanner input6 = new Scanner(System.in);
                        response = input6.next();
                        if (response.equals("y")) {
                            System.out.print("Check exhaust pipe forward of catalytic converter for leaks. Listen for a lifter rap on valve cover");
                        } else if (response.equals("n")) {
                            System.out.print("Is the windshield wipers, and radio off?(y/n): ");
                            Scanner input7 = new Scanner(System.in);
                            response = input7.next();
                            if (response.equals("y")) {
                                System.out.print("Look for pulley wobble, inspect belts, and check for exhaust manifold leaks.");
                            } else if (response.equals("n")) {
                                System.out.print("Check for silly noises first before assuming engine problems.");
                            }
                        }
                    } else if (response.equals("n")) {
                        System.out.print("Only ticks when turing, or on curves?(y/n): ");
                        Scanner input6 = new Scanner(System.in);
                        response = input6.next();
                        if (response.equals("y")) {
                            System.out.print("CV joint going out or the tire is too big for wheel well.");
                        } else if (response.equals("n")) {
                            System.out.print("Did you just change your tires?(y/n): ");
                            Scanner input7 = new Scanner(System.in);
                            response = input7.next();
                            if (response.equals("y")) {
                                System.out.print("Stop Driving! Make sure wheel lugs are tightened.");
                            } else if (response.equals("n")) {
                                System.out.print("Did you remove the hubcaps ?(y/n): ");
                                Scanner input8 = new Scanner(System.in);
                                response = input8.next();
                                if (response.equals("y")) {
                                    System.out.print("Did you inspect the tire treads?(y/n): ");
                                    Scanner input9 = new Scanner(System.in);
                                    response = input9.next();
                                    if (response.equals("y")) {
                                        System.out.print("Only ticks when moving slowly?(y/n): ");
                                        Scanner input10 = new Scanner(System.in);
                                        response = input10.next();
                                        if (response.equals("y")) {
                                            System.out.print("Check bolted wheel covers, and hub protectors for pebbles.");
                                        } else if (response.equals("n")) {
                                            System.out.print("Likely brake pads ticking on wrapped rotor; also check axles for rubbing.");
                                        }
                                    } else if (response.equals("n")) {
                                        System.out.print("Check for nails or stones embedded in tire tread.");
                                    }
                                } else if (response.equals("n")) {
                                    System.out.print("Remove hubcaps before proceeding. Loose wire retainer, pebbles can tick.");
                                }
                            }
                        }
                    }
                } else if (response.equals("n")) {
                    System.out.print("Only ticks when moving in reverse?(y/n): ");
                    Scanner input5 = new Scanner(System.in);
                    response = input5.next();
                    if (response.equals("y")) {
                        System.out.print("Possible rear break adjustment, make sure parking break is fully released.");
                    } else if (response.equals("n")) {
                        System.out.print("Possible transmission tick. Check transmission filter and fluid.");
                    }
                }
            }
            else if (response.equals("n")) {
                    System.out.print("Is it a ticking time bomb?: ");
                        Scanner inputA = new Scanner(System.in);
                        response = inputA.next();
                        if (response.equals("y")){
                            System.out.print("Google how to disarm time bomb..");
                        }
                        else if (response.equals("n")) {
                            System.out.printf("Try to localize tick with a hearing tube or long screwdriver (listen at handle) %n");
                            System.out.print("Does it only tick when it's cold?(y/n): ");
                            Scanner input6 = new Scanner(System.in);
                            response = input6.next();
                            if (response.equals("y")) {
                                System.out.print("Check exhaust pipe forward of catalytic converter for leaks. Listen for a lifter rap on valve cover");
                            } else if (response.equals("n")) {
                                System.out.print("Is the windshield wipers, and radio off?(y/n): ");
                                Scanner input7 = new Scanner(System.in);
                                response = input7.next();
                                if (response.equals("y")) {
                                    System.out.print("Look for pulley wobble, inspect belts, and check for exhaust manifold leaks.");
                                } else if (response.equals("n")) {
                                    System.out.print("Check for silly noises first before assuming engine problems.");
                                }
                            }
                        }
                }
            }
        }
    }

