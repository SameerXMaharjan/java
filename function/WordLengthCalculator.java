package function;

import java.util.Scanner;

public class WordLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a sentence.");
        String sentence = scanner.nextLine();

        //trim() in Java removes all the leading and trailing spaces in the string.
        // Split the sentence into words based on whitespace
        String[] words = sentence.trim().split("\\s+");
        int length = words.length;

        System.out.println("The number of words in the sentence is: " + length);

        scanner.close();
    }
}
