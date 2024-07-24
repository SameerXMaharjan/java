package Function2.Calculator;

import java.util.Scanner;

public class CalculatorOfArea {
//    public double areaOFTriangle(int num1,int num2,int num3){
//        return math.sqrroot
//    }
    public double areaOfRectangle(int l, int b) {
        return l * b;
    }

    public double areaOfSquare(int l) {
        return l * l;
    }

    public double areaOfCircle(int r){
        return r*r;
    }

    public  void  run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number your want for calculation :- ");
        System.out.println("1. Area of Triangle.");
        System.out.println("2. Area of Rectangle.");
        System.out.println("3. Area of Square.");
        System.out.println("4. Area of circle.");
        System.out.println("5. Exit....");


        double num1, num2, num3, l, b, r;
        double result;
        CalculatorOfArea cal = new CalculatorOfArea();
        boolean cont = true;

        while(cont){
            System.out.println("\nEnter your choice");
            int choice ;
            choice = sc.nextInt();
            if (choice < 6 && choice > 0) {
                switch (choice) {
                    case 1:
                        System.out.println("Area of triangle");
                        break;

                    case 2:
                        System.out.println("\nCalculating the Area of Rectangle...");

                        System.out.println("Enter the length");
                        l = sc.nextInt();

                        System.out.println("Enter the breadth");
                        b = sc.nextInt();

                        result = cal.areaOfRectangle((int) l, (int) b);

                        System.out.println(result + "\n");

                        break;


                    case 3:
                        System.out.println("Calculating the Area of Square...");

                        System.out.println("Enter the length");
                        l = sc.nextInt();

                        result = cal.areaOfSquare((int) l);

                        System.out.println(result);
                        break;

                    case 4:
                        System.out.println("Calculating the Area of Circle...");

                        System.out.println("Enter the radius");
                        r = sc.nextInt();

                        result = cal.areaOfCircle((int) r);

                        System.out.println(result);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        cont = false;
                        break;

                    default:
                        System.out.println();

                }

            } else {
                System.out.println("Invalid Input");
            }
        }
    }



}