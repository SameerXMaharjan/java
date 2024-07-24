package operators;

import java.util.Scanner;

public class largeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any First number : ");
        double a = scanner.nextDouble();

        System.out.println("Enter any Second number : ");
        double b = scanner.nextDouble();

        System.out.println("Enter any Third number : ");
        double c = scanner.nextDouble();

        if (a > b && a > c) {
            System.out.println(a + " is largest number among three number");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest number among three number");
        } else {
            System.out.println(c + " is the largest number among three number");
        }
    }
}
