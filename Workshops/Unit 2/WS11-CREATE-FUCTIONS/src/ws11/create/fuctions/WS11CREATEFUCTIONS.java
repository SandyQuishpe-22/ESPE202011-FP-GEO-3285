/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.create.fuctions;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class WS11CREATEFUCTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // DONE

        Scanner scanner = new Scanner(System.in);
        int variableA;
        int variableB;
        int multiplication;
        int sum;
        float division;
        int module;
        int table1;
        int table2;
        char option;

        do {
            System.out.println("<====HELLO====>");
            System.out.println("<=====WELCOME USER====>");
            System.out.println("====MY NAME'S SANDY====");
            System.out.println("*===Enter the variable A===*");
            variableA = scanner.nextInt();
            scanner.nextLine();

            System.out.print("*===Enter the variable B===* ");
            variableB = scanner.nextInt();
            scanner.nextLine();

            if (variableA % 2 == 0 && variableB % 2 == 0) {
                showMultiplication(variableA, variableB);

            } else if (variableA % 3 == 0 && variableB % 3 == 0) {
                showAddition(variableA, variableB);

            } else if (variableA % 7 == 0 && variableB % 7 == 0) {
                showModules(variableA, variableB);

            } else if (variableA % 11 == 0 && variableB % 11 == 0) {
                for (int i = 1; i <= 12; i++) {
                    table1 = variableA * i;
                    System.out.println(variableA + " * " + i + " = " + table1 + "\n");
                }
                for (int j = 1; j <= 12; j++) {
                    table2 = variableA * j;
                    System.out.println(variableB + " * " + j + " = " + table2 + "\n");
                }
            } else if (variableA % 13 == 0 && variableB % 13 == 0) {
                showDivision(variableA, variableB);

            } else {
                System.out.println("Invalid option");
            }

            System.out.println("<===TRY AGAIN USER===>?/ENTER ANY LETTER/ LATER (L)\"");
            option = scanner.nextLine().charAt(0);
            
        } while (option != 'L');
        System.out.println("<===BYE USER===>");
    }

    private static void showDivision(int variable1, int variable2) {
        float division;
        division = variable1 / variable2;
        System.out.println("The division of " + variable1 + " / " + variable2 + " = " + division);
    }

    private static void showModules(int variable1, int variable2) {
        int module;
        module = variable1 % variable2;
        System.out.println("The module of " + variable1 + " % " + variable2 + " = " + module);
    }

    private static void showAddition(int variable1, int variable2) {
        int sum;
        sum = variable1 + variable2;
        System.out.println("The sum of " + variable1 + " + " + variable2 + " = " + sum);
    }

    private static void showMultiplication(int variable1, int variable2) {
        int multiplication;
        multiplication = variable1 * variable2;
        System.out.println("The multiplication of " + variable1 + " * " + variable2 + " = " + multiplication);
    }
}
    

