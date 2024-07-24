package conditionalStatement;

import java.util.Scanner;

public class voterChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >=18 && age < 100){
            System.out.println("Hello "+name+" your age is "+age+". You are Eligible for voting.");
        } else if (age<18 && age>0) {
            System.out.println("Hello "+name+" your age is "+age+". You are not Eligible for voting.");
        }else {
            System.out.println("Invalid Input!!!");
        }
    }
}
