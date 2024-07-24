package conditionalStatement;

import java.util.Arrays;
import java.util.Scanner;

public class alphabetChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter any alphabet: ");
        String alphabet = scanner.next().toLowerCase();

        String[] vowel = {"a", "e", "i", "o", "u"};

        if (Arrays.asList(vowel).contains(alphabet)) {
            System.out.println("It is Vowel Letter");
        } else {
            System.out.println("It is Consonant Letter");
        }
    }
}
