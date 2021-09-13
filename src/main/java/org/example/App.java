package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday

Exercise 19 - BMI Calculator
        You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.

        Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.

        Calculate the BMI by using the following formula:

        bmi = (weight / (height × height)) * 703
        If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

        Example Output
        Your BMI is 19.5.
        You are within the ideal weight range.
        or

        Your BMI is 32.5.
        You are overweight. You should see your doctor.
        Constraint
        Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.

 */

import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        double ur_height_in_inches = 0;
        double ur_weight_in_ib = 0;
        double Your_Body_Mass_INDEX;

        Scanner in = new Scanner(System.in);
        System.out.println("In pounds, how much do you weigh?");
        ur_weight_in_ib= in.nextDouble();

        System.out.println("In inches, what's your height?");
        ur_height_in_inches = in.nextDouble();


        Your_Body_Mass_INDEX = (ur_weight_in_ib / (ur_height_in_inches * ur_height_in_inches)) * 703;

        if ( 18.5 <= Your_Body_Mass_INDEX && Your_Body_Mass_INDEX <= 25 )
        {
            System.out.printf("Your BMI is %.1f\n",Your_Body_Mass_INDEX);


            System.out.println("You are within the ideal weight range.");
        }
        if(Your_Body_Mass_INDEX > 25)
        {
            System.out.printf("Your BMI is %.1f\n", Your_Body_Mass_INDEX);

            String output =("You are overweight. You should see your doctor.");
            System.out.println(output);

        }
        if(Your_Body_Mass_INDEX < 18.5)
        {
            System.out.printf("Your BMI is %.1f\n", Your_Body_Mass_INDEX);

            //System.out.println("You're underweight. You need to contact your physician now!");
            String output = ("You're underweight. You need to contact your physician now!");
            System.out.println(output);
        }
    }
}
