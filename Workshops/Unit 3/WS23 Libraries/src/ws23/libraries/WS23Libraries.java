/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws23.libraries;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */

public class WS23Libraries {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercertage = 12;
        
        Scanner input = new Scanner(System.in);
        System.out.println("====Sandy Quihspe Taxes====");
        System.out.println("   IVA --> ");
        System.out.println("====Enter de price of your products====");
        price = input.nextFloat();
        
        ivaValue = BasicTax.computerIva(price, ivaPercertage);
        totalPrice= price + ivaValue;
        System.out.println("= total price -->" + totalPrice);
        
    }
    
}
