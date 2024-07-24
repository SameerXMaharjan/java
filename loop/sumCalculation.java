package loop;

import java.util.Scanner;

public class sumCalculation {
    public static void main(String[] args) {
//        Write a program to calculate the sum of the
//        first 10 natural numbers both using for loop and while loop.

        int sum = 0;
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of the first 10 natural numbers using a for loop: " + sum);

//        while (i <= 10) {
//            sum += i;
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Sum of the first 10 natural numbers using a while loop: " + sum);
    }
}
