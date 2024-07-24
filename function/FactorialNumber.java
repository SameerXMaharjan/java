package function;

import java.util.Scanner;

public class FactorialNumber {
    public int getFactorial(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int number = scanner.nextInt();

        FactorialNumber factorialNumber = new FactorialNumber();
        int fact =factorialNumber.getFactorial(number);

        System.out.println(fact);

    }
}
