/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
  Scanner input = new Scanner(System.in); 
       
       //CALCULATION OF IVA
       float value = 0.0F;
       final float percentage = 12.0F;
       float total;
       float iva;
       iva = obtainIva (value, percentage);
       System.out.println("*Welcome to Calculator Taxes*");
       System.out.println("*My name is Sandy*");
       System.out.println("****The value of the IVA is**** ");
       System.out.println("***Enter VALUE****");
       value = input.nextInt();
       iva = value * percentage / 100;
        
       System.out.println("**** IVA is --> " + iva);
        
       total = value + iva;
        
       System.out.println("VALUE: " + value);
       System.out.println("IVA: " + iva);
       System.out.println("Total: " + total);
       
      //CURRENCY EXIT TAX
       
       float amount = 0.0F;
       final float quantity = 0.0F;
       float remaining;
       final float tax = 0.05F;
       float Amount;
       
       Amount = outflowtax (amount, quantity);
       
       System.out.println("****The Value is****");
       System.out.println("****Enter is amount ->");
       amount = input.nextInt();
       
       Amount = (amount - quantity) * 0.05F;
       
       System.out.println(" ****Amount --> " + Amount);
       
       //Income tax calculation
       //basic fraction $0.10   Excess up to $11212
       float valuetax = 0.0F;
       final float basicfraction = 0.0F;
       float surplusfraction = 0.10F;
       float tax1 = 0.0F;
       float totalEnergyValue;
       
       totalEnergyValue = Incometax (valuetax, basicfraction, surplusfraction,tax1);
       
       System.out.println("****The Income tax is****");
       System.out.println("****Enter ValueTax -> ");
       valuetax = input.nextInt();
       
       totalEnergyValue = ((valuetax - basicfraction)* surplusfraction)+ tax1 ;
       
        System.out.println("****Total Energy Value --> " + totalEnergyValue);
       
       //basic fraction $11212   Excess up to $14285
       float valuetax2 = 0.0F;
       final float basicfraction2 = 0.0F;
       final float surplusfraction2 = 11212F;
       final float tax2 = 0.0F;
       float totalWaterValue;
       
       totalWaterValue = Incometax2 (valuetax2, basicfraction2, surplusfraction2,tax2);
       
       System.out.println("****The Income tax is****");
       System.out.println("****Enter valueTax2 -> ");
       valuetax2 = input.nextInt();
       
       totalWaterValue = ((valuetax2 - basicfraction2)* surplusfraction2)+ tax2 ;
       
       System.out.println("****Total Water Value --> " + totalWaterValue);
       
       //basic fraction $14285 excess up to $17854
       float valuetax3 = 0.0F;
       final float basicfraction3 = 14285F;
       final float surplusfraction3 = 0.10F;
       final float tax3 = 154.0F;
       float totalValue;
       
       totalValue = Incometax3 (valuetax3, basicfraction3, surplusfraction3,tax3);
       
       System.out.println("****The Income tax is****");
       System.out.println("****Enter valuet3 -> ");
       valuetax3 = input.nextInt();
       
       totalValue = ((valuetax3 - basicfraction3)* surplusfraction3)+ tax3 ;
       
       System.out.println("****Total Value --> " + totalValue);
       System.out.println("***BYE USER****");
       
    }
       public static float obtainIva(float value, float percentage) {
       float iva = 0.0F;
                iva = (float) value * (float) percentage / 100;
           return iva;
       
       }
       public static float outflowtax (float amount, float limitquantity) {
         
       float value = 0.0F;
             value = ((float)amount - (float)limitquantity) * 0.05F;
             
             return value;
             
       }
       public static float Incometax (float valuetax, float basicfraction, float surplusfraction, float tax1 ){
            float value1 = 0.0F;
            
            
                   value1 = ((((float) valuetax - (float) basicfraction))* (float)surplusfraction)+ (float)tax1 ;
            
                   return value1;
        }
       public static float Incometax2 (float valuetax2, float basicfraction2, float surplusfraction2, float tax2 ){
            float value2 = 0.0F;
            
            
                   value2 = ((((float) valuetax2 - (float) basicfraction2))* (float)surplusfraction2)+ (float)tax2 ;
            
                   return value2;
        }
       public static float Incometax3 (float valuetax3, float basicfraction3, float surplusfraction3, float tax3 ){
            float value3 = 0.0F;
            
            
                   value3 = ((((float) valuetax3 - (float) basicfraction3))* (float)surplusfraction3)+ (float)tax3 ;
            
                   return value3;    
        }
     
}
