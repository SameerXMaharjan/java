package function;

public class AverageNumberChecker {
    /**
     * This class is for checking highest number among three of them
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public int averageNumberForHighest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }

    /**
     * this class is for checking lowest number
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public int averageNumberForLowest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        }
        return num3;
    }


    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 0;
        AverageNumberChecker averageNumberChecker =new AverageNumberChecker();

        int highestNumber = averageNumberChecker.averageNumberForHighest(num1,num2,num3);

        int lowestNumber = averageNumberChecker.averageNumberForLowest(num1,num2,num3);

        System.out.println(highestNumber);
        System.out.println("The Lowest number is "+lowestNumber);
    }
}
