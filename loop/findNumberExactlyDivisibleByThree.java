package loop;

import java.util.Scanner;

public class findNumberExactlyDivisibleByThree {
    public static void main(String[] args) {

        findNumberExactlyDivisibleByThree findNumber = new findNumberExactlyDivisibleByThree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.println("Enter the Upper Limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Numbers exactly divisible by 3:");
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (findNumber.checkIfNumberIsExactlyDivisibleByThree(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean checkIfNumberIsExactlyDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
