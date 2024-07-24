package function;

import java.util.Scanner;

public class Product {
    public float multiple(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Product product =new Product();

        System.out.println("Enter any number :");
        int a = scanner.nextInt();

        System.out.println("Enter another number :");
        int b = scanner.nextInt();

        float pt =product.multiple(a,b);
        System.out.println(pt);
    }
}
