package conditionalStatement;

import java.util.Scanner;

public class angleChecker {
    public static void main(String[] args) {
        int a=40,b=55,c=65;

        int sum = a+b+c;
        System.out.println("The sum of angle of triangle is "+sum+"\n The angle of triangle must be 180");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angle X of triangle");
        int x= scanner.nextInt();
        System.out.println("Enter angle y of triangle");
        int y= scanner.nextInt();
        System.out.println("Enter angle z of triangle");
        int z= scanner.nextInt();

        int total=x+y+z;

        if (total==180){
            System.out.println("The sum of triangle is "+total+"\n This triangle is valid");
        }else {
            System.out.println("The sum of triangle is "+total+"\n This triangle is not valid");
        }
    }
}
