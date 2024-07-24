package string;

import java.util.Scanner;

public class lengthAndLastCharacter {

    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);

        System.out.print("Enter any String =");
        String word = scanner.next();

        String lastString = word.substring(word.length()-1);
        System.out.println(word.length());
        System.out.println(lastString);
    }
}
