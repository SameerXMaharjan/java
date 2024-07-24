package function;

import java.util.Scanner;

public class MaxAndMinimumChecker {
    public int maximumNumberChecker(int num1, int num2, int num3) {
//        for maximum Number
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }

    public int minimumNumberChecker(int num1, int num2, int num3) {
//        for minimum Number
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        }
        return num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third Number");
        int num3 = scanner.nextInt();

        MaxAndMinimumChecker maxAndMinimumChecker = new MaxAndMinimumChecker();
        int result1 = maxAndMinimumChecker.maximumNumberChecker(num1, num2, num3);
        int result2 = maxAndMinimumChecker.minimumNumberChecker(num1, num2, num3);

        System.out.println("The maximum number among three that you entered is " + result1);
        System.out.println("The minimum number among three that you entered is " + result2);
    }
}
