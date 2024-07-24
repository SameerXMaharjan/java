package function;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindrome(int number){
        if (number<0){
            return false;
        }
        int original = number;
        int reversedNumber =0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return original==reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = scanner.nextInt();

        boolean result=palindrome(number);
        if (result){
            System.out.println("The number is palindrome Number");
        }
        else {
            System.out.println("The number is not palindrome Number");
        }
        System.out.println(result);
    }
}
