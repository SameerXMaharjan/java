package conditionalStatement;

import java.util.Scanner;

public class numberChecker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter any number: ");
        int a = scanner.nextInt();


        if (a%2 == 0){
            System.out.println(a+" Is Even");
        }else {
            System.out.println(a+" Is Odd");
        }
    }
}
