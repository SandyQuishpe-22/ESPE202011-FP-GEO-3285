/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18.searching;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        Scanner input = new Scanner(System.in);
        int arr[] = {1, 3, 4, 6, 7, 9, 11, 22, 24, 38, 39, 40,42};
        int n = arr.length;
        int x;
        int result;
        System.out.println(" -----Hi :) -----");
        System.out.println(" -----My name is Sandy-----");
        System.out.println("-----------------------------------------------");
        System.out.println("1, 3, , 4, 6, 7, 9, 11, 22, 24, 38, 39, 40 ,42");
        System.out.println("-----------------------------------------------");
        System.out.println("****Enter a element****");
        x = input.nextInt();
        result = BinarySearch.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("----ITEM NOT FOUND----");
        } else {
            System.out.println("---The element found in the index is --->" + result);
        }
        System.out.println("****Enter a element****");
        x = input.nextInt();
        result = LinearSearch.search(arr, x);
        if (result == -1) {
            System.out.println("----ITEM NOT FOUND----");
        } else {
            System.out.println("---The element found in the index is --->" + result);
        }
    }
}
