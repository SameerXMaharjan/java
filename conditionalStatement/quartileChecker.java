package conditionalStatement;

import java.util.Scanner;

public class quartileChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer for X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter any integer for Y coordinate: ");
        int y = scanner.nextInt();

        if (x >= 0 && y >= 0){
            System.out.println(x+","+y+" lies in 1st Quadrant");
        } else if (x >=0 && y<0) {
            System.out.println(x+","+y+" lies in 2nd Quadrant");
        }else if (x<0 && y<0){
            System.out.println(x+","+y+" lies in 3rd Quadrant");
        }else {
            System.out.println(x+","+y+" lies in 4th Quadrant");
        }

    }
}
