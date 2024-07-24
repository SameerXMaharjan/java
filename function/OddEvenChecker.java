package function;

import java.util.Scanner;

public class OddEvenChecker {
    public boolean isEven(int parameter) {
        boolean isEven = true;
        if (parameter % 2 != 0){
             isEven=false;
        }
            return isEven;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
        int parameter = scanner.nextInt();

        OddEvenChecker oddEvenChecker =new OddEvenChecker();
        boolean result = oddEvenChecker.isEven(parameter);

        System.out.println(result);

    }
}
