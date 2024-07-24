package loop;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

// 2 ra enter gareko number vanda ek step tala ko number le divide garda reminder 0 aaunu vayana

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime == true){
            System.out.println("The Enter number "+n+" is prime");
        }else{
            System.out.println("The Enter number "+n+" is Not prime");
        }
    }
}
