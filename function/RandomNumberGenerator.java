package function;

import java.util.Random;

public class RandomNumberGenerator {

    // Method to generate a random integer within a specified range [min, max]
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        // Example usage:
        int randomNum = generateRandomNumber(1, 100);
        System.out.println("Random number between 1 and 100: " + randomNum);
    }
}
