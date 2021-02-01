package hw04menus;
    import java.util.Scanner;
    public class HW04Menus{
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do{
            System.out.println("====== Calculator ======");
            System.out.println("1. -> Perimeter of the triangle");
            System.out.println("2. -> Perimeter of a rectangle");
            System.out.println("3. -> Tabla of multiplication of number 6");
            System.out.println("4. -> downward collation from 20 to 5");
            System.out.println("5. -> Exit"); 
            option = input.nextInt();

            switch (option) {

                case 1:
                    int SideA;
                    int SideB;
                    int SideC;
                    int perimeter;
                    System.out.println("enter Side A -> ");
                    SideA = input.nextInt();
                    System.out.println("enter Side B -> ");
                    SideB = input.nextInt();
                    System.out.println("enter Side C -> ");
                    SideC = input.nextInt();                    
                    perimeter = SideA + SideB + SideC;
                    System.out.println("Perimeter of the triangle is -->" + 
                            perimeter);
                    break;
                    
                case 2:
                    int Side1;
                    int Side2;
                    int Side3;
                    int Side4;
                    
                    System.out.println("enter Side 1 -> ");
                    Side1 = input.nextInt();
                    System.out.println("enter Side 2 -> ");
                    Side2 = input.nextInt();
                    System.out.println("enter Side 3 -> ");
                    Side3 = input.nextInt();
                    System.out.println("enter Side 4 -> ");
                    Side4 = input.nextInt();                    
                    perimeter = Side1 + Side2 + Side3 + Side4;
                    System.out.println(" the perimeter of rectangle is -->" +
                            perimeter);
                    break;
                    
                case 3:
                    int top=12;
                    int product=0;
                    int table=6;
                    for (int j= 0 ; j<= top ; j++){
                    product = table * j;
                    System.out.println("The table of multiplication of number 6 is");
                    System.out.println("6 *" + j + " = " + product);
                   }                  
                  
                    break;
                case 4:
                  
                    System.out.println("downward collation from 20 to 5");
                    int star=20;
                    int stop=5;
                    for (int j=20 ; j>=stop ; j--) {
                    System.out.println(j);
     }
                    
                case 5:
                    System.out.println("Hello my pex");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
                   
              