package loop;

import java.util.Scanner;

public class forAndWhile {
    public static void main(String[] args) {

        int a=1,b=10;
        for (a=1;a<=b;a++){
            System.out.println(a);
        }
        while (a<=b){
            System.out.println(a);
            a++;
        }
    }

    public static class sumEvenAndOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int oddSum = 0, evenSum = 0;

            System.out.println("Enter Lower Limit");
            int lowerLimit = scanner.nextInt();

            System.out.println("Enter upper Limit");
            int upperLimit = scanner.nextInt();


            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else if (i % 2 != 0) {
                    oddSum += i;

                }
            }
            System.out.println("The sum of even number is "+evenSum);
            System.out.println("The sum of odd number is "+oddSum);
        }
    }
}
