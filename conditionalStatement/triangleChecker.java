package conditionalStatement;

import java.util.Scanner;

public class triangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any First side : ");
        double a = scanner.nextDouble();

        System.out.println("Enter any Second side : ");
        double b = scanner.nextDouble();

        System.out.println("Enter any Third side : ");
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("It is equilateral triangle");
        } else {
            System.out.println("It is not equilateral triangle");
        }
        if (a == b || b == c) {
            System.out.println("But, It is isosceles triangle");
        } else if (a == c) {
            System.out.println("But, It is isosceles triangle");
        } else {
            System.out.println("Nighter, It is isosceles triangle");
        }
    }
}
