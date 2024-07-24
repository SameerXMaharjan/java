package function;

import java.util.Scanner;

public class HaveVowelOrNot {

    // Method to check if the input contains any vowels
    public boolean hasVowel(String input) {
        // Convert input to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Define vowels as a string containing all vowel characters
        String vowels = "aeiou";

        // Check each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (vowels.contains(String.valueOf(ch))) {
                return true; // Found a vowel, so return true
            }
        }
        return false; // No vowels found in the input string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write anything:");
        String input = scanner.nextLine();

        HaveVowelOrNot vowelChecker = new HaveVowelOrNot();

        // Call hasVowel method and print result
        boolean result = vowelChecker.hasVowel(input);

        if (result) {
            System.out.println("The input contains at least one vowel.");
        } else {
            System.out.println("The input does not contain any vowels.");
        }

        scanner.close();
    }
}
