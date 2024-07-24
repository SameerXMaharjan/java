package function;

public class SumOfNumber {
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 25;
        int num3 = 30;
        SumOfNumber sumOfNumber =new SumOfNumber();
        int result = sumOfNumber.sum(num1,num2,num3);
        System.out.println("The Sum of the number is "+result);
    }
}
