package function;

import java.util.Scanner;

public class RangeNumberPrimeChecker {

    public boolean isPrime(int testNumber){
        boolean isPrime = true;
        for (int i =2;i<testNumber;i++){
            if (testNumber % i==0){
                return false;
            }
        }return isPrime;

    }
    public void checkPrime(int start,int end){
         for (int i=2;i<=end;i++){
             if (isPrime(i)) {
                 System.out.print(i + " ");
             }
         }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the starting Number");
        int start = scanner.nextInt();

        System.out.println("Enter the ending Number");
        int end = scanner.nextInt();

        RangeNumberPrimeChecker rangeNumberPrimeChecker = new RangeNumberPrimeChecker();
        rangeNumberPrimeChecker.checkPrime(start,end);
    }
}
