package conditionalStatement;

import java.util.Scanner;

public class positiveChecker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter any number");
        int num = scanner.nextInt();

        if (num<0 || num !=0){
            System.out.println("It is not positive");
        }else {
            System.out.println("It is positive");
        }
    }
}
