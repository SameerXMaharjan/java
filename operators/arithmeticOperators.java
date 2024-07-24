package operators;

import java.util.Scanner;

public class arithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number : ");
        double a = scanner.nextDouble();

        System.out.println("Enter any number : ");
        double b = scanner.nextDouble();

//        for arithmetic Operation
        if (a <=0 || b <= 0) {
            System.out.println("Invaild input!! \n" +
                    "The input must be greater than 0 ");
        }else{
            double sum = a + b;
            double diff = a - b;
            double product = a * b;
            double qoutient = a / b;
            double reminder = a % b;


            System.out.println("Sum: " + sum + "\nSubtract: " + diff + "\nProduct " + product+"\nDivide "+qoutient+"\nReminder "+reminder);
        }

    }
}
