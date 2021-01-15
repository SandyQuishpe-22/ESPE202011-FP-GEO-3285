/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02squareperimetro;

/**
 *
 * @author Usuario
 */
public class SquarePerimetroFloat {

    
    public static void main(String[] args) {
        float squareperimetro;
        
        
try (Scanner leer = new Scanner(System.in)) {
			float ladoa=0, ladob=0, ladoc=0, ladod=0;
			System.out.println("Ingrese el lado a: ");
			ladoa=leer.nextFloat ();       
			System.out.println("Ingrese el lado b: ");
			ladob=leer.nextFloat ();
			System.out.println("Ingrese el lado c: ");
			ladoc = leer.nextFloat();
			System.out.println("Ingrese el lado d:");
			ladod=leer.nextFloat();
                       
                        squareperimetro = ladoa + ladob + ladoc + ladod;
                        System.out.println("El perimetro del cuadrado es: " + squareperimetro);
  
}
}   
}   

