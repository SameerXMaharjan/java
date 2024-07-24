package function;

import java.util.Scanner;

public class PrimeNumber {
    public boolean checkPrime(int testNumber){
        boolean isPrime = true;
        for (int i =2;i<testNumber;i++){
            if (testNumber % i==0){
                return false;
            }
        }return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
        int testNumber = scanner.nextInt();

        PrimeNumber primeNumber =new PrimeNumber();
        boolean result = primeNumber.checkPrime(testNumber);
        System.out.println(result);
    }
}
