package function;


import java.util.Scanner;

public class LengthOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the length of the number (number of digits)
        int length = String.valueOf(number).length();

        System.out.println("Length of the number " + number + " is: " + length);


    }
}
