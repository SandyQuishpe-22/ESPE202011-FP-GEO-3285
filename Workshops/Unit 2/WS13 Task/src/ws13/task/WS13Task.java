/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Quishpe Sandy
 */
public class WS13Task {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int opcion=0;
  do{
  System.out.println(" ====Hello====");
  System.out.println(" ====My mane is Sandy====");
  System.out.println(" ======== OPTION MENU ========= ");
  System.out.println(" ___________________________________ ");
  System.out.println(" ___________________________________ ");
  System.out.println(" ======== 1. Calculator for the area of ​​the Pentagon ========= ");
  System.out.println(" ======== 2. Calculator for the area of ​​the Rhomboid========= ");
  System.out.println(" ======== 3. Calculator for the area of ​​the Trapezoid========= ");
  System.out.println(" ======== 4. Exit====");
  System.out.println(" ___________________________________ ");
  System.out.println(" ___________________________________ ");
  System.out.println(" ====Enter an option====");
  opcion = input.nextInt();
  switch (opcion){
  
   
      
        case 1:
            computerAreaOfPentagon(input);
        break;
        case 2:
            computerAreaofRomboid(input);
        break;
        case 3:
            computerAreaofTrapeze(input);
        break;
        case 4:
            computerExit();
        break;
        default:
}

    }while (opcion != 4);
}

    private static void computerExit() {
        System.out.println("=== BYE USER ===");
        System.exit(0);
    }

    private static void computerAreaofTrapeze(Scanner input) {
        System.out.println("===ENTER MAJOR BASE===");
        int base_ma=input.nextInt();
        System.out.println("===ENTER THE MINOR BASE===");
        int base_me=input.nextInt();
        System.out.println("===ENTER HEIGHT===");
        int height_t=input.nextInt();
        System.out.println("===THE AREA OF THE TRAPEZE IS===:"+computetrapeziumarea(base_ma,base_me,height_t));
    }

    private static void computerAreaofRomboid(Scanner input) {
        System.out.println("===Enter base===");
        int base_r =input.nextInt();
        System.out.println("===Enter Height===");
        int height_r =input.nextInt();
        System.out.println("===THE ROMBOID AREA IS===:"+computerhomboidarea(base_r,height_r));
    }

    private static void computerAreaOfPentagon(Scanner input) {
        System.out.println("===Enter the perimeter===");
        int perimetro = input.nextInt();
        System.out.println("===Enter the Apothem===");
        int apothem= input.nextInt();
        System.out.println("===THE PENTAGON AREA IS=== :"+computepentagonarea(perimetro,apothem));
    }

public static int computepentagonarea(int perimeter, int apothem){
     return (perimeter*apothem) / 2;
    }
  public static int computerhomboidarea(int base,int height){
     return base*height ;
    }
  public static int computetrapeziumarea (int Base , int base , int height){
  
   return ((Base+base)/2)*height;
  }
}
