package loop;

import java.util.Scanner;

public class factorialChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input");
        } else {
            int factorial = 1, i = 1;
            while (i<=num){
                factorial *= i;
                i++;
            }
            System.out.println(factorial);
        }
    }
}