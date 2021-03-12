/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.fuctions;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS21Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    
int day1 = 0;
int day2 = 0;
int result;
int kilometers= 12;
int kilometerstraveled;
int spentfuel;

System.out.println("**WELCOME**");
System.out.println("**MY NAME IS SANDY QUISHPE**");
        calculatorAddTotalGasolineConsumedTwoDays(scanner);

System.out.println("Calculator to know the fuel used in km :");  
System.out.println("Enter the kilometers:");      
kilometerstraveled = scanner.nextInt();

spentfuel=(kilometerstraveled)/kilometers;
System.out.println("Total fuel->"+ spentfuel);   
    }

    private static void calculatorAddTotalGasolineConsumedTwoDays(Scanner scanner) {
        int day1;
        int day2;
        int result;
        System.out.println("Calculator to add the total gasoline consumed in two days ");
        System.out.println("Enter the value on the first day :");
        day1 = scanner.nextInt();
        System.out.println("Enter the value on the second day:");
        day2 = scanner.nextInt();
        result = day1+day2;
        System.out.println("The total sum of gasoline consumed in two days is " + day1 + " + " + day2 + " = " + result);
    }
    
}