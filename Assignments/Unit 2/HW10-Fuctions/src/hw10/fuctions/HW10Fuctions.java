/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.fuctions;

import java.util.Scanner;

/**
 *
 * @author Quishpe_Sandy
 */
public class HW10Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        
        Scanner input = new Scanner(System.in);
        int divd;
        int divr;
        float quotient = 0;
        int x = 0;
        int y = 0;
        int multiplicand;
        int product;
        int top = 12;
        
        
        System.out.println("**==HELLO USER==**");
        System.out.println("<=====Enter numb for divd=====>");
        divd = input.nextInt();
        
        System.out.println("<=====Enter numb for divr=====>");
        divr = input.nextInt();
                
        
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient is -> " + quotient);

        System.out.println("<=====Enter numb fuction=====>");
        x = input.nextInt();
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);
        
        System.out.println("<=====Enter numb fuction=====>");
        x = input.nextInt();
        y = g(x);
        System.out.println("the value of -> " + x + " <- is equal to -> " + y);
        
        System.out.println("<=====Enter positive number====>");
        multiplicand = input.nextInt();
        for (int multiplier = 1 ; multiplier <= top ; multiplier++){
            product = gettable (multiplicand, multiplier);
            System.out.println(multiplicand  + " x " + multiplier + " = " + product);
            
        }
            System.out.println("<====BYE USER====>");
        
}

    
    public static float divideTwoNumbers(int dividend, int divisor) {
        
        float quotient = 0.0F;

       
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }
    
    public static int gettable(int multiplicand, int multiplier){
        int product;
        
        product = multiplicand*multiplier;
        
        return product;
    }

}
