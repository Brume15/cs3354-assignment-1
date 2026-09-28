import java.util.Scanner;

/**
 * Helper class providing input validation routines for the Grocery Management System.
 *
 * @author Chris
 */
public class InputValidator {

    /**
     * Re-prompts the user until a valid integer within [min, max] is supplied.
     */
    public static int getValidIntRange(Scanner scanner, int min, int max, String prompt) {
        int choice = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
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
     * Re-prompts until a positive integer (> 0) is entered.
     */
    public static int getPositiveInt(Scanner scanner, String prompt) {
        int amount = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
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