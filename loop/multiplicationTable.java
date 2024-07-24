package loop;

import java.lang.invoke.MutableCallSite;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        multiplicationTable mt = new multiplicationTable();

        System.out.println("Enter the number");
        int number= scanner.nextInt();

        System.out.println("Enter the number");
        int limit= scanner.nextInt();



        mt.printMultiplicationTable(number,limit);

    }

    public void printMultiplicationTable(int number , int limit){
        for (int i = 1;i<=limit;i++){
            String result = giveMeTableLine(number,i);
            System.out.println(result);
        }
    }

    public String giveMeTableLine (int number, int i){
        return number + " X " + i + " = " + (number*i);
    }
}
