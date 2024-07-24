package loop;

import java.util.Scanner;

public class hcfCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user to input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF using the Euclidean algorithm
        int hcf = calculateHCF(num1, num2);

        // Print the HCF
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to calculate HCF using the Euclidean algorithm
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
