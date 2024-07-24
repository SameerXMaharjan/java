package loop;

import java.util.Scanner;

public class numberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zeros count: " + zeroCount);

    }
}
