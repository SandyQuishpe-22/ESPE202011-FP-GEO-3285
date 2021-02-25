/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @Quishpe Sandy
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DONE
        Scanner input = new Scanner(System.in);
        System.out.println(" ====Hello :) ====");
        System.out.println(" ====My name is Sandy====");
        System.out.println(" ====Welcome to the calculator to subtract matrixs====");
        System.out.println(" ______________________________________________________ ");

        int rows;
        System.out.println("---Enter the rows of the arrays---");
        rows = input.nextInt();
        int columns;
        System.out.println("---Enter the columns of the matrices---");
        columns = input.nextInt();

        int matrixA[][] = new int[rows][columns];;
        int matrixB[][] = new int[rows][columns];;
        int matrixSubtraction[][] = new int[rows][columns];
        System.out.println(" ______________________________________________________ ");

        System.out.println("Matrix A data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter a number  position: a[" + i + "][" + j + "] " + " --> ");
                matrixA[i][j] = input.nextInt();

            }

        }

        System.out.println("Matrix B data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter a number position: b[" + i + "][" + j + "] " + "  --> ");
                matrixB[i][j] = input.nextInt();

            }
        }
        System.out.println();
        System.out.println("Matrix structure A");
        System.out.println(" ___________________________________");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print("\t " + matrixA[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ____________________________________");
        System.out.println();
        System.out.println("Matrix structure B");
        System.out.println(" ___________________________________");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print("\t " + matrixB[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixSubtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }

        }
        System.out.println(" ___________________________________");
        System.out.println("\n The subtraction of the matrices is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("\t" + matrixSubtraction[i][j]);
            }
            System.out.println();

            System.out.println();

        }
        

    }
    

}

