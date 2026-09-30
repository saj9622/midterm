// OOP- LAB ACTIVITY – MIDTERM
// Program : 3
// Write a java program to delete a element in an array from specific position. The output should be as
// similar as given below:
// OUTPUT
// Enter Data in Array: 10 20 30 40 50
// Stored Data in Array: 10 20 30 40 50
// Enter poss. of Element to Delete: 2
// New data in Array: 10 20 40 50

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

import java.util.Scanner;

public class week_7_act_program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = 5;
        int[] arr = new int[n];
        
        System.out.print("Enter Data in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("\nStored Data in Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("\nEnter poss. of Element to Delete: ");
        int pos = input.nextInt();
        
        if (pos < 0 || pos >= n) {
            System.out.println("\nINVALID");
        } else {
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; 
            
            System.out.print("\nNew data in Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
