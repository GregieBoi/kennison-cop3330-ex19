/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex19 {

    // main
    public static void main(String[] args) {

        // initialize variables
        double height = get_height();
        double weight = get_weight();

        // pass to calc_BMI
        calc_BMI(height, weight);

    }

    // gets height in inches
    public static double get_height() {

        // prompts for input and returns scan
        System.out.print("Enter your height in inches: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();

    }

    // gets weight in pounds
    public static double get_weight() {

        // prompts for input and returns scan
        System.out.print("Enter your weight in pounds: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();

    }

    // calculates bmi and passes to weight status
    public static void calc_BMI(double height, double weight) {

        // set format
        DecimalFormat df = new DecimalFormat("#.##");

        // calculate bmi
        double bmi = (weight / (height * height)) * 703;

        // print first of output then pass to weight status for rest of output
        System.out.println("Your BMI is " + df.format(bmi));
        weight_status(bmi);
    }

    // determines if the user is under, over, or in weight range
    public static void weight_status(double bmi) {

        // if else to determine output
        if (bmi < 18.5)
            // print that user is under
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi > 25)
            // print that user is over
            System.out.println("You are overweight. You should see your doctor.");
        else
            // print that user is in
            System.out.println("You are within the ideal weight range.");
    }
}
