// OOP- LAB ACTIVITY – MIDTERM
// Program : 5
// Write a java program -----the output should be as similar as given below:
// OUTPUT :
// *
// *A*
// *A*A*
// *A*A*A*

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

public class week_7_act_program_5 {
    public static void main(String[] args) {
        int totalBlocks = 4; 

        for (int i = 0; i < totalBlocks; i++) {
            System.out.print("*");
            
            for (int j = 0; j < i; j++) {
                System.out.print("A*");
            }
            
            if (i < totalBlocks - 1) {
                System.out.print(" \n");
            }
        }
        System.out.println();
    }
}