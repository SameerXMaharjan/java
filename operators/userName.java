package operators;

import java.util.Scanner;

public class userName {
    public static void main(String[] args) {
//        Ask user their name as input and print it with Hello
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
