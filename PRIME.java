import java.util.Scanner;
public class PRIME {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false;
        }
        
        // Check if the number is divisible by any number between 2 and sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        
        // If no divisors are found, the number is prime
        return true;
    }
}
