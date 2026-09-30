// OOP- LAB ACTIVITY – MIDTERM
// Program : 2
// Write a java program that reads the 8 integer numbers from the user into an array, then it will do the
// following:
// • Remove duplicate elements from an array.
// • Find the second largest element in an array.
// • Find the second smallest element in an array.

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

import java.util.Arrays;
import java.util.Scanner;

public class week_7_act_program_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] originalArray = new int[8];
        
        System.out.println("Enter 8 integer numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("");
            originalArray[i] = input.nextInt();
        }
        
        int[] uniqueArray = Arrays.stream(originalArray).distinct().toArray();
        
        System.out.println("\nOriginal Array: " + Arrays.toString(originalArray));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        
        if (uniqueArray.length < 2) {
            System.out.println("\nCannot find second largest or second smallest elements because there are less than 2 unique numbers.");
        } else {
            Arrays.sort(uniqueArray);
            int secondSmallest = uniqueArray[1];
            int secondLargest = uniqueArray[uniqueArray.length - 2];
            
            System.out.println("The second smallest element is: " + secondSmallest);
            System.out.println("The second largest element is: " + secondLargest);
        }
        
        input.close();
    }
}
