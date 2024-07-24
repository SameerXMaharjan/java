package StringExercise;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = sc.nextLine();

        int len = input.length();


        String reversedString = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed String is "+reversedString);
        System.out.println(len);


    }
}
