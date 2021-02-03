
package hw08.factorialnumber;
import java.util.Scanner;
public class HW08FactorialNumber {
public static void main(String[] args) {
        // DONE
        
        int number;
        int factorial =1;
        int stop =15;
        
        
       
        do{
            System.out.println("======WELCOME THE CALCULATOR TO  NUMBER FACTORIAL======");
            System.out.println(" Enter a number ");
            System.out.println(" Exit ");
            
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            
            if (number <= 15){
            System.out.println("The factorial of -->" + number);
            for (int i = number; i > 0; i--) {
                factorial = factorial *i;
                
            }
            System.out.println("The factorial is --> " + factorial);
            
            }
        }while (number <=15 );
            
            System.out.println("Bye Friend ");
        
}

        
}

        
        
        
    
    

