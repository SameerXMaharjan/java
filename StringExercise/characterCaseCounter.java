package StringExercise;

import java.util.Scanner;

public class characterCaseCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
        }
        System.out.println("UpperCase is " + upperCase);
        System.out.println("LowerCase is " + lowerCase);
    }
}
