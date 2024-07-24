package StringExercise;

import java.util.Scanner;

public class whiteSpaceCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        int len = input.length();

        int whiteSpaceCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                whiteSpaceCounter++;
            }
        }

        System.out.println("WhiteSpace is " + whiteSpaceCounter);
        System.out.println("Length of string is " + len);

    }
}
