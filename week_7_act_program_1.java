// OOP- LAB ACTIVITY – MIDTERM
//  Program : 1
// 1) Write a program that reads 10 real numbers from the user (negative and positive numbers) into an
// array, then it will do the following:
//  - find the sum and average of positive numbers of the array and display them.
//  - count negative numbers of the array and display it.
//  - find the minimum value of the array and display it.
// Use a separate loop for each one of the tasks shown above.

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

import java.util.Scanner;

public class week_7_act_program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter 10 real numbers (positive or negative):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("");
            numbers[i] = input.nextDouble();
        }

        double sumPositive = 0;
        int countPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
                countPositive++;
            }
        }

        int countNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                countNegative++;
            }
        }

        double minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        if (countPositive > 0) {
            double averagePositive = sumPositive / countPositive;
            System.out.println("Sum of positive numbers: " + sumPositive);
            System.out.println("Average of positive numbers: " + averagePositive);
        } else {
            System.out.println("No positive numbers were entered, so sum and average cannot be computed.");
        }

        System.out.println("Count of negative numbers: " + countNegative);
        System.out.println("Minimum value in the array: " + minValue);
        
        input.close(); // Fixed resource leak
    }
}
