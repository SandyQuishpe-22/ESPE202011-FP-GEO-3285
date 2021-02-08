/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.recursion;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Number1;
        int Number2;
        System.out.println("*====HELLO ====*");
        System.out.print("*===Enter the first number===*");                                                           
        Number1 = input.nextInt();
        System.out.print("*===Enter second number===*");
        Number2 = input.nextInt();
        System.out.println("sum: " + Sum(Number1, Number2));                                                              
        System.out.println("*====GOOD BYE USER ====*");
    }
    public static int Sum(int Number1, int Number2) {
        if (Number2 == 0) {
            return Number1;
        } else if (Number1 == 0) {
            return Number2;
        } else {
            return 1 + Sum(Number1, Number2 - 1);
        }
    }
}

