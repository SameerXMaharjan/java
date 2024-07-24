package function;

public class GCDRecursive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return gcd(b, a % b); // Recursive case: GCD(a, b) = GCD(b, a % b)
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int num1 = 0;
        int num2 = 36;

        // Calculate GCD using the gcd method
        int result = gcd(num1, num2);

        // Print the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
