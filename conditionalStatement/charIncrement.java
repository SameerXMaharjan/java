package conditionalStatement;

import java.util.Scanner;

public class charIncrement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter any string");
        String input = scanner.nextLine();

        char[] alphabet = input.toCharArray();

        for (int i=0;i<alphabet.length;i++){
            char alph = alphabet[i];

            if ((alph >= 'a' && alph <= 'z') || (alph >= 'A' && alph <= 'Z')){
                alphabet[i]=(char)(alph+1);
            }
        }
        System.out.println("Modified string: " + new String(alphabet));
    }
}
