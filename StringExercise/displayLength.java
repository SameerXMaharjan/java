package StringExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class displayLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String: ");
        String word = sc.nextLine();

        Set<Character> uniqueChars = new LinkedHashSet<>();

        for(char c :word.toCharArray()){
            uniqueChars.add(c);
        }

        StringBuilder uniqueString = new StringBuilder();
        for(char c : uniqueChars){
            uniqueString.append(c);
        }

        int length = word.length();

        char lastCharacter = word.charAt(length - 1);

        System.out.println("Input word is " + word);
        System.out.println("String with unique characters : "+uniqueString.toString());
        System.out.println("Length of word is " + length);
        System.out.println("LastCharacter of word is " + lastCharacter);
    }
}
