package StringExercise;

import java.util.Scanner;

public class inputChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first string: ");
        String first = sc.next();

        System.out.println("Enter your Second String: ");
        String second = sc.next();

        if(first.equals(second)){
            System.out.println("Both string is same!!! ");
        }else {
            System.out.println("Entered string is not same");
        }
    }

}
