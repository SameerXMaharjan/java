package operators;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner square = new Scanner(System.in);

        System.out.print("Enter lenght: ");
        double len = square.nextDouble();

        double perimeter = 4*len;
        double area = Math.pow(len,2);

        System.out.println("Perimeter: "+perimeter + "\nArea: "+area);
    }
}
