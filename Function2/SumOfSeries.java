package Function2;

import java.util.Scanner;

public class SumOfSeries {
    public double sum(int num) {
        int fact=1;
        for (int i=2;i<=num;i++){
//            for (int j=)
            fact = fact*i;
            
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        SumOfSeries ss = new SumOfSeries();
        double result = ss.sum(num);
        System.out.println(result);

    }
}
