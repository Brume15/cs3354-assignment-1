import java.util.Scanner;

public class InputValidator {

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