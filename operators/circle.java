package operators;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = circle.nextDouble();

        double perimeter = 2 * Math.PI *r;
        double area = Math.PI*Math.pow(r,2);

        System.out.println("Perimeter: "+perimeter + "\nArea: "+area);
    }
}
