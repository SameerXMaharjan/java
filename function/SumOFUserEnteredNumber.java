package function;

import java.util.Scanner;

public class SumOFUserEnteredNumber {
//    public int sum(int num1,int num2){
//        return num1+num2;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        SumOFUserEnteredNumber sumOFUserEnteredNumber = new SumOFUserEnteredNumber();

        String result = sumOFUserEnteredNumber.sumOfNumber(num1,num2);
        System.out.println("The sum process is given below \n"+result);
    }

    public String sumOfNumber(int num1,int num2){
        return num1 + " + " + num2 + " = " + (num1+num2);
    }
}
