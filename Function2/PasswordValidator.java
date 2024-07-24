package Function2;

import java.util.Scanner;

public class PasswordValidator {
    public boolean isValidPassword(String password){

        if (password.length()<10){
            return false;
        }

        int digitCount = 0;

        for (int i = 0;i<password.length();i++){
            char ch =password.charAt(i);

            if (!Character.isLetterOrDigit(ch)){
                return false;
            }
            if (Character.isDigit(ch)){
                digitCount++;
            }
        }
        if (digitCount<2){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.next();

        System.out.println("Enter the password: ");
        String password = sc.next();

        PasswordValidator passwordValidator = new PasswordValidator();

        boolean isValid = passwordValidator.isValidPassword("");
        if (isValid){
            System.out.println("The password is Valid");
        }else {
            System.out.println("The password is invalid");
        }
    }
}
