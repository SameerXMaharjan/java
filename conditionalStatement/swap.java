package conditionalStatement;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fromNumber: ");
        int fromNumber= scanner.nextInt();

        System.out.println("Enter the toNumber");
        int toNumber= scanner.nextInt();

//If fromNumber is less than toNumber then print all the numbers from fromNumber to toNumber ;
// inclusive fromNumber and exclusive toNumber
        if (fromNumber>=0 && toNumber>=0){
            if (fromNumber < toNumber){
                for (int i=fromNumber;i<toNumber;i++){
                    System.out.println(i);
                }
            }
//            If fromNumber is greater than toNumber, swap the numbers and perform the same process as above.
            else {
                int temp = fromNumber;
                fromNumber = toNumber;
                toNumber = temp;
                for (int i = fromNumber; i <= toNumber; i++) {
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
