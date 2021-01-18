
package quishpe.sandy.q11;
import java.util.Scanner;
public class QuishpeSandyQ11 {

    public static void main(String[] args) {
     
       
      Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Table 6");
            System.out.println("2. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Multiplication Tables : 6");
                 int top=12;
                 int product=1;
                 int table=6;
                 for (int j= 1 ; j<= top ; j++){
                 product = table * j;
            System.out.println("6 *" + j + " = " + product);
                }
                     break;
               case 2:{
                    System.out.println("Good Bye");
                    System.exit(0);
                }
                    System.out.println("Invalid option\n\n\n");

            }

        } while (option != 2);

    }

}