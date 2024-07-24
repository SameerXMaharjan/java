package conditionalStatement;

import java.util.Scanner;

public class gradeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your mask of Nepali: ");
        float nep= scanner.nextFloat();

        System.out.println("Enter your mask of English: ");
        float eng= scanner.nextFloat();

        System.out.println("Enter your mask of Math: ");
        float math= scanner.nextFloat();

        System.out.println("Enter your mask of Science: ");
        float Sci= scanner.nextFloat();

        System.out.println("Enter your mask of Account: ");
        float acc= scanner.nextFloat();


    }
}
