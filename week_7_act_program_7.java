// OOP- LAB ACTIVITY – MIDTERM
// Program : 7
// Write a Java Program that takes tab separated data (one record line) from a text file and insert them into a database.

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class week_7_act_program_7 {
    public static void main(String[] args) {
        String fileName = "emp.txt";
        System.out.println("Reading data from: " + fileName + "\n");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                

                String[] data = line.split("\t"); 

                if (data.length >= 3) {
                    String id = data[0].trim();
                    String name = data[1].trim();
                    String role = data[2].trim();

                    System.out.println("INSERT INTO employees VALUES ('" + id + "', '" + name + "', '" + role + "');");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
