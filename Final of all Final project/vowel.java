import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        // Initialize a counter variable for vowels
        int y = 0;

        // Display a message to the user
        System.out.println("Type only using lowercase, and I will tell you how many vowels it has");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read a line of input from the user
        String maybe = scanner.nextLine();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Define an array containing vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Iterate through each character in the input string
        for (int x = 0; x < maybe.length(); x++) {
            // Get the current character at the specified index
            char currentChar = maybe.charAt(x);

            // Iterate through each vowel to check for a match
            for (char vowel : vowels) {
                // Check if the current character (case-insensitive) matches a vowel
                if (Character.toLowerCase(currentChar) == vowel) {
                    // Increment the vowel counter and break out of the inner loop
                    y++;
                    break;
                }
            }
        }

        // Display the count of vowels in the input string
        System.out.println("This has " + y + " vowels");
    }
}
