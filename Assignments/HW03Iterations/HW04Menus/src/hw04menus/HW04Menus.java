public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do{
            System.out.println("====== Calculator ======");
            System.out.println("1. -> The perimeter of a rectangle");
            System.out.println("2. -> The perimeter of a square");
            System.out.println("3. -> The area of a rectangle");
            System.out.println("4. -> The area of a square");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int L1;
                    int L2;
                    int L3;
                    int L4;
                    int perimeter;
                    System.out.println("enter L 1 -> ");
                    L1 = input.nextInt();
                    System.out.println("enter L 2 -> ");
                    L2 = input.nextInt();
                    System.out.println("enter L 3 -> ");
                    L3 = input.nextInt();
                    System.out.println("enter L 4 -> ");
                    L4 = input.nextInt();                    
                    perimeter = L1 + L2 + L3 + L4;
                    System.out.println(" the perimeter of rectangle is -->" +
                            perimeter);
                    break;
                case 2:
                     int L5;
                    int L6;
                    int L7;
                    int perimeter;
                    System.out.println("enter L 5 -> ");
                    L5 = input.nextInt();
                    System.out.println("enter L 6 -> ");
                    L6 = input.nextInt();
                    System.out.println("enter L 7 -> ");
                    L7 = input.nextInt();                    
                    perimeter = L5 + L6 + L7;
                    System.out.println("The perimeter of square is -->" + 
                            perimeter);
                    break;
                case 3:
                    int base;
                    int altura;
                    int area;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter altura -> ");
                    altura = input.nextInt();
                    area = base * altura;
                    System.out.println("The area of rectangle is-->" + area);                    

                    break;
                case 4:
                    int base;
                    int altura;
                    int area;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter altura -> ");
                    altura = input.nextInt();
                    area= (base * altura) / 2;
                    System.out.println("The area of square is -->" + area);    

                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    

