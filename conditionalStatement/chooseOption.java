package conditionalStatement;

import java.util.Scanner;

public class chooseOption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. CREATE");
        System.out.println("2. READ");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your choice (1-4): ");
            int choice = 0;
            choice = scanner.nextInt();
            if (choice <= 4 && choice >= 1) {

                switch (choice) {
                    case 1:
                        System.out.println("Create");
                        break;
                    case 2:
                        System.out.println("Read");
                        break;
                    case 3:
                        System.out.println("Update");
                        break;
                    case 4:
                        System.out.println("Delete");
                        break;
                    default:
                        System.out.println("Invalid Input");

                }
            } else {
                System.out.println("Invalid input");
                i--;
            }
        }
    }
}
