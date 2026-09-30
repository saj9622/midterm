// OOP- LAB ACTIVITY – MIDTERM
// Program : 4
// Write a java program to find even elements and odd elements in array . The output should be as
// similar as given below.
// OUTPUT:
// Enter Size of Array : 5
// Enter any 5 elements in Array:
// 10 4 5 2 7
// Even Elements: 10 4 2
// Odd Elements: 7 5

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

import java.util.Scanner;

public class week_7_act_program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Size of Array : ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.print("Enter any " + size + " elements in Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("Even Elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); 
        
        System.out.print("Odd Elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        input.close();
    }
}