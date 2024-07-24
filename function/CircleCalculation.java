package function;

import java.util.Scanner;

public class CircleCalculation {
    public double AreaOFCircle(double radius) {
        return  Math.PI * radius * radius;
    }

    public double PerimeterOfCircle(double radius) {
        return  2 * Math.PI * radius;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius");
        double radius = scanner.nextInt();

        CircleCalculation circleCalculation = new CircleCalculation();

        double area=circleCalculation.AreaOFCircle(radius);
        double perimeter = circleCalculation.PerimeterOfCircle(radius);

        System.out.println("The area of circle is "+ area);
        System.out.print("The perimeter of circle is ");
        System.out.format("%.4f ",perimeter);
    }
}
