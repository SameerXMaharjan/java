package function;

import java.util.Scanner;

public class TableForMultiplication {
    public void printMultiplication(int inputNumber) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " * " + i + " = " + (inputNumber * i));
        }

    }
    /*public String forMultiplicationTable(int i,int inputNumber){
        return i + " * " + inputNumber + " = " + (i*inputNumber);
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for Multiplication Table");
        int inputNumber = scanner.nextInt();

        TableForMultiplication tableForMultiplication = new TableForMultiplication();
        tableForMultiplication.printMultiplication(inputNumber);
    }


}
