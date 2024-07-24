package Function2.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Option In Calculator.. ");
        System.out.println("1. Area ");
        System.out.println("2. Perimeter \n");
        System.out.println();
        

        boolean cont = true;
        while (cont) {

            System.out.println("Enter your option");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CalculatorOfArea calculatorOfArea = new CalculatorOfArea();
                    calculatorOfArea.run();
                    break;
                case 2:
                    System.out.println("For Perimeter Calculation\n");
                    break;

                case 3:

                    System.out.println("he");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}



