package function;

import java.util.Scanner;

public class DisplayRange {
    public void display(int start,int end){
        for (int i =start;i<=end;i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the start number");
        int start = scanner.nextInt();

        System.out.println("Enter the End Number");
        int end = scanner.nextInt();

        DisplayRange displayRange =new DisplayRange();

        displayRange.display(start,end);

    }
}
