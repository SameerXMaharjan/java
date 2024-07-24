package StringExercise;

import java.util.Scanner;

public class specialCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String input = sc.nextLine();

        String specialCharacters = "!@#$%^&*()?:<>,.";

        int specialCharCounter = 0;
        for (int i = 0;i<input.length();i++){

            char ch = input.charAt(i);

            if (specialCharacters.contains(Character.toString(ch))){
                specialCharCounter++;
            }
        }
        System.out.println("Number of special characters : " + specialCharCounter);
    }
}
