/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.example.recursion;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class HW11ExampleRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            
            printVariables();
            
            printConverterMenu();
            option = input.nextInt();

            switch (option) {

                case 1:
                    printFormKilometersToMeters(input);
                    break;
                case 2:
                    printForMetersToCentimeters(input);
                    break;
                case 3:
                    printForMeterstoMillimeters(input);
                    break;
                case 4:
                    printForMetersToNanometers(input);
                    break;

                case 5:
                    printForMetersToFeet(input);
                    break;

                case 6:
                    printForMetersToInches(input);
                    break;

                case 7:
                    printForCentimetersToMicrometers(input);
                    break;
                case 8:
                    printForCentimetersToInches(input);
                    break;

                case 9:
                    printForMilllimetersToNanometers(input);
                    break;

                case 10:
                    printForKilometersToCentimeters(input);
                    break;
                case 11:
                    printForMilesToMeters(input);
                    break;

                case 12:
                    printForMetersToYards(input);
                    break;

                case 13:
                    printForGigametersToMeters(input);
                    break;
                case 14:
                    System.out.println("*====GOOD BYE USER ====*");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 14);

    }

    private static void printForGigametersToMeters(Scanner input) {
        System.out.println("enter enter the data --> ");
        double gigameters = input.nextDouble();
        double meters = gigameters * 1000000000;
        System.out.println(gigameters + " gigameters is equal to " + meters + " meters\n ");
    }

    private static void printForMetersToYards(Scanner input) {
        System.out.println("enter enter the data --> ");
        double meters = input.nextDouble();
        double yard = meters * 1.09361;
        System.out.println(meters + " meters is equal to " + yard + " yard\n ");
    }

    private static void printForMilesToMeters(Scanner input) {
        System.out.println("enter enter the data --> ");
        double miles = input.nextDouble();
        double meters = miles * 1609.344;
        System.out.println(miles + "miles is equal to " + meters + " meters\n ");
    }

    private static void printConverterMenu() {
        System.out.println("***WELCOME TO GEOCONVERTER***");
        System.out.println("¿How I can help?");
        System.out.println("--->1 The  Kilometers to meters");
        System.out.println("--->2 The Meters to centimeters");
        System.out.println("--->3 The Meters to millimeters");
        System.out.println("--->4 The Meters to nanometers");
        System.out.println("--->5 The Meters to feet");
        System.out.println("--->6 The Meters to inches");
        System.out.println("--->7 The Centimeters to micrometers");
        System.out.println("--->8 The Centimeters to inches");
        System.out.println("--->9 The Millimeters to nanometers");
        System.out.println("--->10 The Kilometers to centimeters");
        System.out.println("--->11 The Miles to meters");
        System.out.println("--->12 The Meters to yards");
        System.out.println("--->13 The Gigameters to meters");
        System.out.println("--->14 Exit");
        
        System.out.println(" *==Enter  menu option*== ");
    }

    private static void printVariables() {
        int kilometers;
        int meters;
        int centimeters;
        int millimeters;
        int nanometers;
        int inches;
        int micrometers;
        int feet;
        int gigameters;
        int yard;
    }

    private static void printForKilometersToCentimeters(Scanner input) {
        int kilometers;
        int centimeters;
        System.out.println("**Enter the number** ");
        kilometers = input.nextInt();
        centimeters = kilometers * 100000;
        System.out.println(kilometers + " kilometers is equal to " + centimeters + " centimeters\n ");
    }

    private static void printForMilllimetersToNanometers(Scanner input) {
        int millimeters;
        int nanometers;
        System.out.println("**Enter the number** ");
        millimeters = input.nextInt();
        nanometers = millimeters * 1000000;
        System.out.println(millimeters + " millimeters is equal to " + nanometers + " nanometers\n ");
    }

    private static void printForCentimetersToInches(Scanner input) {
        int centimeters;
        int inches;
        System.out.println("**Enter the number** ");
        centimeters = input.nextInt();
        inches = (int) (centimeters * 0.3937);
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches\n ");
    }

    private static void printForCentimetersToMicrometers(Scanner input) {
        int centimeters;
        int micrometers;
        System.out.println("**Enter the number** ");
        centimeters = input.nextInt();
        micrometers = centimeters * 10000000;
        System.out.println(centimeters + " centimeters is equal to " + micrometers + " micrometers\n ");
    }

    private static void printForMetersToInches(Scanner input) {
        int meters;
        int inches;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        inches = (int) (meters * 39.37);
        System.out.println(meters + " meters is equal to " + inches + " inches\n ");
    }

    private static void printForMetersToFeet(Scanner input) {
        int meters;
        int feet;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        feet = (int) (meters * 3.281);
        System.out.println(meters + " meters is equal to " + feet + " feet\n ");
    }

    private static void printForMetersToNanometers(Scanner input) {
        int meters;
        int nanometers;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        nanometers = meters * 1000000000;
        System.out.println(meters + " meters is equal to " + nanometers + " nanometers\n ");
    }

    private static void printForMeterstoMillimeters(Scanner input) {
        int meters;
        int millimeters;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        millimeters = meters * 1000;
        System.out.println(meters + " meters is equal to " + millimeters + " millimeters\n ");
    }

    private static void printForMetersToCentimeters(Scanner input) {
        int meters;
        int centimeters;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        centimeters = meters * 100;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters\n ");
    }

    private static void printFormKilometersToMeters(Scanner input) {
        int kilometers;
        int meters;
        System.out.println("**Enter the number**");
        kilometers = input.nextInt();
        meters = kilometers * 1000;
        System.out.println(kilometers + " Kilometers is equal to " + meters + " meters\n ");
    }

}        
    
