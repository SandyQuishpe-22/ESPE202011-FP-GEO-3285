/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws24.sorting;

/**
 *
 * @author Quihspe Sandy
 */
public class WS24Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] integersToSort = {4, 3, 6, 8, 9,1};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        BubbleSort.sort(integersToSort);
        System.out.println("");
        printArray(integersToSort);
        
        int[] integersToSort2 = {9, 2, 5, 6, 7};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
        
        integersToSort2 = new int[]{9, 7, 3, 1, 4};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
        
       SelectionSort selectionSort = new SelectionSort();

       integersToSort2 = new int[]{40, 50, -8, 8, 3, 60};
        
        System.out.println("Sorting integers by SELECTION SORT");
        printArray(integersToSort2);
        int[] sortedArray = selectionSort.sort(integersToSort2);
        System.out.println("");
        printArray(sortedArray);
       

    }

    
    public static void printArray(int[] integers){
        int n = integers.length;
        for (int i = 0 ; i <n;i++){
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

}