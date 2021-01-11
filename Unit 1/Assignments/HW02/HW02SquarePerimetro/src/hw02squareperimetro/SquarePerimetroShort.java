package hw02squareperimetro;

import java.util.Scanner;
public class HW02SquarePerimetro {

    
    public static void main(String[] args) {
        short squareperimetro;
        
        
try (Scanner leer = new Scanner(System.in)) {
			short ladoa=0, ladob=0, ladoc=0, ladod=0;
			System.out.println("Ingrese el lado a: ");
			ladoa=leer.nextShort ();       
			System.out.println("Ingrese el lado b: ");
			ladob=leer.nextShort ();
			System.out.println("Ingrese el lado c: ");
			ladoc = leer.nextShort();
			System.out.println("Ingrese el lado d:");
			ladod=leer.nextShort();
                       
                        squareperimetro = ladoa + ladob + ladoc + ladod;
                        System.out.println("El perimetro del cuadrado es: " + squareperimetro);
  
}
}   
}