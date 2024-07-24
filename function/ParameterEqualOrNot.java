package function;

import java.util.Scanner;

public class ParameterEqualOrNot {

    //boolean default value is true.
    public boolean isSameNum(int num1,int num2){
        return num1 == num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        ParameterEqualOrNot parameterEqualOrNot= new ParameterEqualOrNot();
        boolean result = parameterEqualOrNot.isSameNum(num1,num2);
        if (result){

            System.out.println(true +" The numbers are equal");
        }else {
            System.out.println(false+"!!!"+" The number are not equal");
        }

    }
}
