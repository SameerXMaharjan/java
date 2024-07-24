package operators;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sameer = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sameer.nextInt();
        if (num <= 0) {
            System.out.println(num + " iS Invalid Input");
        } else {
            if (num % 2 != 0) {
                System.out.println(num + " Is Odd");
            } else {
                System.out.println(num + " Is even");
            }
        }
    }
}
