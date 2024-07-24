package function;

import java.util.Scanner;

public class VoteEligible {
    public static boolean eliibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        VoteEligible voteEligible = new VoteEligible();

        if (eliibleToVote(age)) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }
    }
}
