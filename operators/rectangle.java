package operators;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner rectangle = new Scanner(System.in);

        System.out.print("Enter length: ");
        double len = rectangle.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = rectangle.nextDouble();

        double perimeter = 2 * (len + breadth);
        double area = len * breadth;

        System.out.println("Perimeter: "+perimeter + "\nArea: "+area);
    }
}
