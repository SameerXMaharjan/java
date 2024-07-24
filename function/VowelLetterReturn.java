package function;

import java.util.Scanner;

public class VowelLetterReturn {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string");
        String str = sc.next();

        VowelLetterReturn vowelLetterReturn = new VowelLetterReturn();

        int result = vowelLetterReturn.vowelCounter(str);
        System.out.println(result + " is " + str);
        System.out.println();
    }

    public int vowelCounter(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }
}
