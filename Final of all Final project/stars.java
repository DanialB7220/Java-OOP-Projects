public class stars {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            // Use print instead of println to keep the asterisks on the same line
            System.out.print("*");

            for (int y = 1; y <= i; y++) {
                System.out.print(" *");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
