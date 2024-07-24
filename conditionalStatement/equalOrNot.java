package conditionalStatement;

import java.util.Scanner;

public class equalOrNot {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first Integers: ");
        int a = scanner.nextInt();

        System.out.println("Enter second Integers: ");
        int b = scanner.nextInt();

        if (a == b){
            System.out.println("First Integer is Equal to Second Integer");
        }else {
            System.out.println("First Integer isNot Equal to Second Integer");
        }
    }
}
