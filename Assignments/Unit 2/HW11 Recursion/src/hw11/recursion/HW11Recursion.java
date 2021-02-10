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
      // DONE
      
       Scanner input = new Scanner(System.in);
        
        System.out.println("***WELCOME ***");
        System.out.println("***MY NAME IS SANDY**");
        int [][] m=    {
                      {1,4,8},
                      {4,8,88},
                      {4,82,73},
                      {81,22,33},
                           };
       traverseRecursiveMatrix(m, 0,0);
       System.out.println("***BYE FRIEND***");
    }

     public static void traverseRecursiveMatrix(int[][] m, int i, int j){
         System.out.print (m[i][j]+" ");
         if(i!=m.length-1 || j!=m[i].length-1){
        if(j==m[i].length-1){
            i++;
            j=0;
            System.out.println("");
            }else{
               j++;
            }
            traverseRecursiveMatrix(m, i, j);
            
        }
    
     }

}