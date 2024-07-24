package conditionalStatement;

import java.util.Scanner;

public class heightChecker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter your height in feet: ");
        float feet = scanner.nextFloat();

        float centimeter= (float) 30.48F;
        float height=centimeter*feet;

        System.out.println("Your height in feet is "+feet +" and your height in centimeter is "+height);

        if (height>=160){
            System.out.println("You are tall!!");
        }else {
            System.out.println("You are not tall!!!");
        }
    }
}
