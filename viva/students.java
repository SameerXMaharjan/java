package viva;

import java.sql.*;
import java.util.Scanner;

/**
 * Write a program to execute multiple threads in priority base
 */
public class students {
    PreparedStatement ps = null;
    ResultSet rs = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        String firstName = sc.nextLine();
        System.out.println("Enter the Last name");
        String lastName = sc.nextLine();
        System.out.println("Enter the email");
        String email = sc.nextLine();

    }

}
