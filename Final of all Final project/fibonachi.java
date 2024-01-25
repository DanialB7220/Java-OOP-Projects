import java.util.Scanner;

public class fibonachi {

    public static void main(String[] args) {
        // Prompt the user to enter a number
        System.out.println("Enter a number, and I will print the reverse Fibonacci series:");
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer from the user
        int n = scanner.nextInt();
        
        // Close the scanner to prevent resource leaks
        scanner.close();
        
        // Display the reverse Fibonacci series
        System.out.println("Reverse Fibonacci Series:");
        printReverseFibonacci(n);
    }

    // Recursive method to calculate and print Fibonacci numbers in reverse order
    public static void printReverseFibonacci(int n) {
        for (int i = n-1; i >= 0; i--) {
            // Print each Fibonacci number in reverse order
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base case: return n for n <= 1
        if (n <= 1) {
            return n;
        } else {
            // Recursive case: sum of the previous two Fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
