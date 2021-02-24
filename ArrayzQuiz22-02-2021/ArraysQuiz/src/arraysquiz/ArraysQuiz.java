/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquiz;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class ArraysQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
   Scanner input = new Scanner(System.in);
     int[] agesStudents;
        String[] student = {"Joel", "Carlos", "Jairo", "Gabriel","Alejandro","Cristopher","Giss",
            "Deimy", "Ariel", "Mateo","Benjamin"};  
        int n;
        System.out.println("Enter the number of the students -> ");
        n = input.nextInt();

        agesStudents = new int[n];
        
//        agestudent[0] = 20;
//        agestudent[1] = 11;
//        agestudent[2] = 23;
//        agestudent[3] = 22;
//        agestudent[4] = 18;
//        agestudent[5] = 15;
//        agestudent[6] = 16;
//        agestudent[7] = 10;
//        agestudent[8] = 13;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student's age " + (i + 1) + " -> ");
            agesStudents[i] = input.nextInt();
        }

        for (int ages : agesStudents) {
            System.out.println("The ages of the students are " + ages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Ages of the students " + (i + 1) + " -> " + agesStudents[i]);
        }

        for (String students : student) {
            System.out.println("Students name -> " + students);
        }
       
// Correction
        int totalOfStudents = 0;
        String[] students;
        float[] ageStudent;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number students -> ");
        totalOfStudents = scanner.nextInt();

        students = new String[totalOfStudents];
        ageStudent = new float[totalOfStudents];

        for (int i = 0; i < totalOfStudents; i++) {
            scanner.nextLine();
            System.out.print(" Enter the name of Student # " + i + " -> ");
            students[i] = scanner.nextLine();
            System.out.print(" Enter " + students[i] + " age Students ->");
            ageStudent[i] = scanner.nextFloat();
        }

        System.out.println(" Student    ->  \t    age Student ");

        for (int i = 0; i < totalOfStudents; i++) {
            System.out.println(students[i] + " ->  \t " + ageStudent[i]);
        }

    }

}