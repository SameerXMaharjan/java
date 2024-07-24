package loop;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any more than 2 digit integers: ");
        int num = scanner.nextInt();

        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}