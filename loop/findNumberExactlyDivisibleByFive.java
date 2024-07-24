package loop;

import java.util.Scanner;

public class findNumberExactlyDivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        findNumberExactlyDivisibleByFive fn = new findNumberExactlyDivisibleByFive();

        System.out.println("Enter the lower limit");
        int lowerLimit = scanner.nextInt();

        System.out.println("Enter the upper limit");
        int upperLimit = scanner.nextInt();

        System.out.println("Number exactly divisible by five form "+lowerLimit+" to "+upperLimit);

        for (int i = lowerLimit;i<=upperLimit;i++){
            if (fn.checkTheNumberDivisibleByFive(i)){
                System.out.println(i);;
            }
        }

    }

    public boolean checkTheNumberDivisibleByFive(int number){
        return (number % 5==0);
    }
}
