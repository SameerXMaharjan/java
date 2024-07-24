import java.util.Scanner;


public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        /**
         * sum of natural number
         */
//        for (int i = 1; i <= num; i++) {
//
//             sum = sum + i;
//        }
//        System.out.println(sum);

/**
 * Multiplication table
 */
//        System.out.println("The multiplication table of " + num);
//        for (int i = 1; i <= num; i++) {
//            int multiplication = num * i;
//            System.out.println(num + " * " + i + " = " + multiplication);
//        }

        /**
         * pattens
         *
         */

//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//                for (int i = 0; i < num; i++) {
//                    for (int j = 0; j < num; j++) {
//                        // Print '*' for the first and last row, or the first and last column of the middle rows
//                        if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
//                            System.out.print("* ");
//                        } else {
//                            System.out.print("  ");
//                        }
//                    }
//                    System.out.println();
//                }


//        for (int i = 0; i < num; i++) {
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for (int i = num;i>0;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
