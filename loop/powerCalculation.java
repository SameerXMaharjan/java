package loop;

import java.util.Scanner;

public class powerCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ans = 1,i=1;

        System.out.println("Enter the number");
        int num = scanner.nextInt();

        System.out.println("Enter the power");
        int power = scanner.nextInt();

        for (i = 1; i <= power; i++) {
            ans *= num;
        }
        System.out.println(ans);
    }
}
