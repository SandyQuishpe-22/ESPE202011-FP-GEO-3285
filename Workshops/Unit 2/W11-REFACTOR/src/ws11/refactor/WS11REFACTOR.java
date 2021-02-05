/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.refactor;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class WS11REFACTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
    
Scanner input = new Scanner(System.in);
        int divd;
        int divr;
        float quotient = 0;
        int varblX = 0;
        int varblY = 0;
        int multiplicand;
        int product;
        int top = 12;
        System.out.println("<====HELLO====>");
        System.out.println("====MY NAME'S SANDY====");
        System.out.println("<=====WELCOME USER====>");
        System.out.println("*====Enter to divition====*");
        System.out.println("*====Enter to divd====*");
        divd = input.nextInt();
        
        System.out.println("*====Enter tho divr====*");
        divr = input.nextInt();
                
        
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient is -> " + quotient);
       
        System.out.println("*====Enter Numb Squared====*");
        varblX = input.nextInt();
        varblY = f(varblX);
        System.out.println("the square of -> " + varblX + " <- is equal to -> " + varblY);
        
        System.out.println("*====Enter a numb for equation====*");
        varblX = input.nextInt();
        varblY = g(varblX);
        System.out.println("the value of -> " + varblX + " <- is equal to -> " + varblY);
        
        System.out.println("4)**Enter Multiplication table**");
        multiplicand = input.nextInt();
        for (int multiplier = 1 ; multiplier <= top ; multiplier++){
            product = gettable (multiplicand, multiplier);
            System.out.println(multiplicand  + " x " + multiplier + " = " + product);
            
        }
            System.out.println("<====GOOD BYE USER====>");
          
}

    
    public static float divideTwoNumbers(int divd, int divr) {
        
        float quotient = 0.0F;

       
        quotient = (float) divd / (float) divr;

        return quotient;
    }

    public static int f(int varblX) {
        int varblY = 0;

        varblY = varblX * varblX;

        return varblY;
    }

    public static int g(int varblX) {
        int varblY = 0;

        varblY = varblX * varblX + 2 * varblX + 1;

        return varblY;
    }
    
    public static int gettable(int showaaTheMultiplicationTable, int multiplier){
        int product;
        
        product = showaaTheMultiplicationTable*multiplier;
        
        return product;
    }
    

}    

