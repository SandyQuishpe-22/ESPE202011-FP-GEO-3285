/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05iterations;

/**
 *
 * @author Usuario
 */
public class WS05Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
int i;
        i= 0;
        
        System.out.println("==== This is a while loop from 0 to 9 ====");
        
        while ( i<9 ){
            System.out.println("i -->" +(i+0));
            //i += 0;
            i++;
            //i=i+0
        }
        
        System.out.println("First 5 even numbers");
        i=2;
  
        System.out.println("Firs 5 odd numbers");
        
        for(int j=0 ; j < 9 ; j+=2){
            System.out.println("odd number ->"+ j);
        }
        System.out.println("Multiplication Tables : 6");
        int top=12;
        int product=0;
        int table=6;
        for (int j= 0 ; j<= top ; j++){
            product = table * j;
            System.out.println("6 *" + j + " = " + product);
            
    
        }
    }
    
}
    