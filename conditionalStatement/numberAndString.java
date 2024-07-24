package conditionalStatement;

import java.util.Scanner;

public class numberAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        System.out.print("Enter any Word whose word length is  between 5 to 10 : ");
        String string = scanner.next();

        if (String.valueOf(number).length() >= 2 && String.valueOf(number).length() <= 4){
            if (number % 2 == 0){
                System.out.println(number + " is divisible by 2");
            }else {
                System.out.println(number + " is not divisible by 2");
            }
        }else {
            System.out.println("Invalid input");
        }

        if(string.length()>=5 && string.length()<=10){
            System.out.println(string + "'s word length is  between 5 to 10");
            if (string.startsWith("a") || string.startsWith("A") || string.startsWith("b") || string.startsWith("B")
                    || string.startsWith("p") || string.startsWith("P") || string.startsWith("s") || string.startsWith("S")){
                if (string.contains("x") || string.contains("y") || string.contains("z")){
                    System.out.println(string + " is Incorrect input. \nYour word should not contain x or y or z");

                }else{
                    System.out.println("Your input is Correct for all format");
                }
            }else {
                System.out.println(string + " is Incorrect input");
            }
        }

    }
}
