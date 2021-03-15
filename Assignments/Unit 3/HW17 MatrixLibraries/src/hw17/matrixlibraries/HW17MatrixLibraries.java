/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17.matrixlibraries;

import static ec.edu.espe.espe.matrix.BasicMatrix.addTwoMatrices;
import static ec.edu.espe.espe.matrix.BasicMatrix.prettyPrinMatrix;
import static ec.edu.espe.espe.matrix.BasicMatrix.readMatrix;
import static ec.edu.espe.espe.matrix.BasicMatrix.subtractionTwoMatrices;
import static ec.edu.espe.espe.matrix.BasicMatrix.transpose;
import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int columns;
        int rows;
        float[][] matrixA;
        float[][] matrixB;
        float[][] transpose;
        float[][] matrixC;

        Scanner input = new Scanner(System.in);
        System.out.println(" -----Hi :) -----");
        System.out.println(" -----My name is Sandy-----");
        System.out.println("---------* Enter the matrix dimensions *---------");
        System.out.print("\n -----columns ---> ");
        rows = input.nextInt();

        System.out.print("\n -----rows ---> ");
        columns = input.nextInt();

        matrixA = new float[rows][columns];
        matrixB = new float[rows][columns];
        matrixC = new float[rows][columns];
        transpose = new float[rows][columns];

        System.out.println("-------* Enter the elements of the matrix *-------");
        matrixA = readMatrix(rows, columns, "Matrix A", input);
        matrixB = readMatrix(rows, columns, "Matrix B", input);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("-------------------------------------");
        System.out.println("-------- > Matrix A");

        prettyPrinMatrix(rows, columns, matrixA);
        System.out.println("");

        System.out.println("-------- > Matrix B");

        prettyPrinMatrix(rows, columns, matrixB);
        System.out.println("");
        System.out.println("-------------------------------------");
        transpose(columns, rows, transpose, matrixA);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("---------* The transpose of the matrix is *---------");

        prettyPrinMatrix(rows, columns, transpose);

        System.out.println("");
        System.out.println("---------* The subtraction of matrices is *---------");
        matrixC = subtractionTwoMatrices(rows, columns, matrixA, matrixB);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");
        System.out.println("--------------* The sum of matrices is *------------");

        matrixC = addTwoMatrices(rows, columns, matrixA, matrixB);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");

        System.out.println("-------------------*Bye :)*---------------------");

    }

}
