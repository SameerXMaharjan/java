package loop;

import java.util.Scanner;

public class repeatLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        repeatLoop rl = new repeatLoop();

        int firstNumber;
        int secondNumber;
        char repeatChoice;
//        System.out.println("enter char");
//        char alphabet = scanner.

        do {
            System.out.print("Enter the First number: ");
            firstNumber = scanner.nextInt();

            System.out.print("Enter the Second number: ");
            secondNumber = scanner.nextInt();

            int sum = rl.sumCalculationOfEnteredNumber(firstNumber, secondNumber);
            System.out.println("Sum of entered numbers: " + sum);

            System.out.print("Do you want to repeat the loop? (Y/N): ");
            repeatChoice = scanner.next().charAt(0);
        } while (repeatChoice == 'Y' || repeatChoice == 'y' );

    }

    public int sumCalculationOfEnteredNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
