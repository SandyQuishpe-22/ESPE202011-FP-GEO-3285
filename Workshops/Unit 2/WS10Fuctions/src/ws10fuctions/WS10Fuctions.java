/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10fuctions;

/**
 *
 * @author Quishpe Sandy
 */
public class WS10Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        
        int divd = 7;
        int divr = 14;
        float quotient = 0;
        int x = 0;
        int y = 0;

        System.out.println("AUTHOR: SANDY QUISHPE");
        //call to divideTwoNumbers() function
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 7 and 14 is -> " + quotient); //0.5 or ?

        y = f(8);
        System.out.println("8^2 -> " + y);

        y = f(-8);
        System.out.println("-8^2 -> " + y); //9
        
        x = -2;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

    }

    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             6        12   -> 0.5
        // float     int        int
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

}