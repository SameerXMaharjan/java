package loop;

import java.util.Scanner;

public class rangeChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number");
        int start = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        int end = scanner.nextInt();

        int sumOfOdd=0;
        int sumOfEven=0;

        if (start>end){
            System.out.println("Invalid");
        }else{
            for (int i = start;i<=end;i++){
                if (i%2 != 0){
                    sumOfOdd += i;
                }else {
                    sumOfEven+=i;
                }
            }
            System.out.println("Sum of odd numbers: " + sumOfOdd);
            System.out.println("Sum of even numbers: " + sumOfEven);
        }
    }
}
