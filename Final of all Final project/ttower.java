import java.util.Stack;

public class ttower {

    // Method to perform the Towers of Hanoi operation
    public static void towersOfHanoi(int n, Stack<Integer> source, Stack<Integer> auxiliary, Stack<Integer> target) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary using target as an auxiliary tower
            towersOfHanoi(n - 1, source, target, auxiliary);

            // Move the nth disk from source to target
            int disk = source.pop();
            target.push(disk);
            System.out.println("Move disk " + disk + " from Tower " + source + " to Tower " + target);

            // Move the n-1 disks from auxiliary to target using source as an auxiliary tower
            towersOfHanoi(n - 1, auxiliary, source, target);
        }
    }

    public static void main(String[] args) {
        // Create three stacks representing three towers
        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        // Initialize tower1 with 4 disks
        for (int i = 4; i >= 1; i--) {
            tower1.push(i);
        }

        // Display the initial state of towers
        System.out.println("Initial state:");
        System.out.println("Tower 1: " + tower1);
        System.out.println("Tower 2: " + tower2);
        System.out.println("Tower 3: " + tower3);

        // Call the method to move 4 disks from tower1 to tower3 using tower2 as an auxiliary tower
        towersOfHanoi(4, tower1, tower2, tower3);

        // Display the final state of towers
        System.out.println("Final state:");
        System.out.println("Tower 1: " + tower1);
        System.out.println("Tower 2: " + tower2);
        System.out.println("Tower 3: " + tower3);
    }
}
