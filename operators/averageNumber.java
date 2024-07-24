package operators;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter any First number : ");
        double a = scanner.nextDouble();

        System.out.println("Enter any Second number : ");
        double b = scanner.nextDouble();

        System.out.println("Enter any Third number : ");
        double c = scanner.nextDouble();

        double average = (a+b+c)/3;

        System.out.println("Average number is "+average);
    }
}
