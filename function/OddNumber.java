package function;

import java.util.Scanner;

public class OddNumber {
    public void displayOddNumber(int start,int end){
        for (int i = start;i<=end;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the start number");
        int start = scanner.nextInt();

        System.out.println("Enter the End Number");
        int end = scanner.nextInt();

        OddNumber oddNumber =new OddNumber();
        oddNumber.displayOddNumber(start,end);
    }
}
