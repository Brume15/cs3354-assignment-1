import java.util.Scanner;
/**
 * A utility class for validating user input.
 */
public class InputValidator {

    /**
     * Prompts the user for an integer input within a specified range and
     *  validates it.
     *
     * @param scanner the Scanner object for reading user input
     * @param min     the minimum acceptable value (inclusive)
     * @param max     the maximum acceptable value (inclusive)
     * @param prompt  the message to display to the user
     * @return a valid integer input from the user within the specified range
     */
    public static int getValidIntRange(Scanner scanner, int min, int max, String prompt) {
        int choice = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear newline character from buffer
                if (choice >= min && choice <= max) {
                    valid = true;
                } else {
                    System.out.println("Error: Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid token
            }
        }
        return choice;
    }

    /**
     * Prompts the user for a positive integer input and validates it.
     *
     * @param scanner the Scanner object for reading user input
     * @param prompt  the message to display to the user
     * @return a valid positive integer input from the user
     */
    public static int getPositiveInt(Scanner scanner, String prompt) {
        int amount = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
                scanner.nextLine(); // Clear newline character from buffer
                if (amount > 0) {
                    valid = true;
                } else {
                    System.out.println("Error: Amount must be greater than zero.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a whole number.");
                scanner.next(); // Clear invalid token
            }
        }
        return amount;
    }
}