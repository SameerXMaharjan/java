package Function2;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number");
        int num1 = sc.nextInt();

        System.out.println("Enter the another number");
        int num2 = sc.nextInt();

        System.out.println("Before swap Num1 is "+num1 +" and Num2 is "+num2);

        int temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("After swap: Num1 = "+num1+"\nNum2 = "+num2);
    }
}
