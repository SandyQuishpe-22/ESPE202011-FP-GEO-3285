/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.arrays;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do { 
            System.out.println(" ====Hello====");
            System.out.println(" ====My mane is Sandy====");
            System.out.println(" _____________ ");
            System.out.println(" ======== OPTION MENU ========= ");
            System.out.println("1. ====domesticAnimals====");
            System.out.println("2. ====herbivorousAnimals====");
            System.out.println(" ======== 2. Exit====");
            System.out.println(" _____________ ");
            System.out.println(" ====Enter an option====");
            option = input.nextInt(); 
            switch (option) {

                case 1 :{            
        int[] domesticAnimals;
        String[] animals = {"dog", "cat", "sheep", "pork", "cow","chicken","guinea pig", "donkey", "goat","duck"};

        
        int n;
        System.out.println("==Enter the name of the animals domestic -> ");
        n = input.nextInt();

        domesticAnimals = new int[n];
//        animalsdomestic[0] = 4;
//        animalsdomestic[1] = 5;
//        animalsdomestic[2] = 6;
//        animalsdomestic[3] = 7;
//        animalsdomestic[4] = 8;
//        animalsdomestic[5] = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the animals" + (i + 1) + " -> ");
            domesticAnimals[i] = input.nextInt();
        }

        for (int animal : domesticAnimals) {
            System.out.println("animal of domestic  are " + animal);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("number of the animal" + (i + 1) + " -> " + domesticAnimals[i]);
         }

        for (String animal : animals) {
            System.out.println("animals name -> " + animal);
        }
        
          }
                
                case 2 : {                

        int[] herbivorousAnimals;
        String[] animals = {"vulture", "alligator", "coyote", "seal", "Tseagull","lizard"};

        int n;
        System.out.println("Enter the name of the animals herbivorous -> ");
        n = input.nextInt();

        herbivorousAnimals = new int[n];
        
//        animalsherbivorous0] = 2;
//        animalsherbivorous[1] = 5;
//        animalsherbivorous[2]= 8;
//        animalsherbivorous[3] = 4;
//        animalsherbivorous[4] = 9;
//        animalsherbivorous[5] = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the animals" + (i + 1) + " -> ");
            herbivorousAnimals[i] = input.nextInt();
        }

        for (int animal : herbivorousAnimals) {
            System.out.println("animal of herbivorous are" + animal);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("number of the animal" + (i + 1) + " -> " + herbivorousAnimals[i]);
            }

        for (String animal : animals) {
            System.out.println("animals name -> " + animal);
        }
        
          }
                
                case 3 :{
                    System.out.println("*Bye User*");
                    System.exit(0);
               }

              
            }
        } while (option != 3);
    }  
}