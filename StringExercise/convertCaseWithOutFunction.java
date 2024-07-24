package StringExercise;

import java.util.Scanner;

public class convertCaseWithOutFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        StringBuilder uppercaseResult = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {

                char uppercaseChar = (char) (ch - 32);
                uppercaseResult.append(uppercaseChar);
            } else {
                uppercaseResult.append(ch);
            }
        }

        StringBuilder lowercaseResult = new StringBuilder();

        for (int i =0; i <input.length();i++){
            char ch = input.charAt(i);
            if (ch >='A'&& ch<='Z'){
                char lowercaseChar = (char) (ch+32);
                lowercaseResult.append(lowercaseChar);
            }else {
                lowercaseResult.append(ch);
            }
        }

        System.out.println("UpperCase " + uppercaseResult.toString());
        System.out.println("LowerCase " + lowercaseResult.toString());
    }
}
