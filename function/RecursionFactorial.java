package function;

import java.util.Scanner;

public class RecursionFactorial {

    public  int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();

        RecursionFactorial rf = new RecursionFactorial();
        int result = rf.factorial(number);

        // Print the result
        System.out.println("Factorial of " + number + " is: " + result);

    }
}
