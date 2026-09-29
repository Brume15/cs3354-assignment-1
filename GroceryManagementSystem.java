import java.util.Scanner;

/**
 * a simple grocery management system that allows users to view inventory
 * and restock existing items. The inventory is represented using parallel
 * arrays
 * for item names, prices, and stock quantities. The system provides a
 * menu-driven
 * interface for users to interact with the inventory.
 * 
 */
public class GroceryManagementSystem {

    /**
     * Runs the menu for viewing inventory and restocking existing items.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // The same index identifies an item across all three arrays.
        itemNames[0] = "Apple";
        itemPrices[0] = 1.25;
        itemStocks[0] = 10;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.50;
        itemStocks[1] = 5;

        itemNames[2] = "Bread";
        itemPrices[2] = 2.75;
        itemStocks[2] = 8;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGrocery Management System");
            System.out.println("1. View inventory");
            System.out.println("2. Restock item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextLine()) {
                break;
            }
            String choice = scanner.nextLine().trim();

            if (choice.equals("3")) {
                System.out.println("Goodbye");
                break;
            } else if (choice.equals("1")) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice.equals("2")) {
                System.out.print("Enter the item name (as shown in inventory): ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String target = scanner.nextLine().trim();

                System.out.print("Enter the amount to add: ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                int amount;
                try {
                    amount = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException exception) {
                    System.out.println("Please enter a positive whole number.");
                    continue;
                }

                if (amount <= 0) {
                    System.out.println("Please enter a positive whole number.");
                    continue;
                }
                restockItem(itemNames, itemStocks, target, amount);
            } else {
                System.out.println("Please choose 1, 2, or 3.");
            }
        }
        scanner.close();
    }

        /**
     * Displays the grocery items stored in the parallel arrays.
     * An item is displayed only when its name is not null.
     *
     * @param names the names of the grocery items
     * @param prices the price of each item at the matching index
     * @param stocks the stock of each item at the matching index
     */
    public static void printInventory(
            String[] names,
            double[] prices,
            int[] stocks) {

        System.out.println("Current Inventory:");

        // Each index refers to the same item in all three arrays.
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                // Print the item only when this slot has a name.
                // Use the same index to get its price and stock.
                System.out.printf("%s - $%.2f - Stock: %d%n",
                        names[i], prices[i], stocks[i]);
            } else {
                // This slot is empty, so move to the next index.
                continue;
            }
        }
    }
    

    /**
     * Restocks an existing grocery item by adding the specified amount 
     * to its stock. prints a message if the item is not found.
     *
     * @param names  the names of the grocery items
     * @param stocks the stock of each item at the matching index
     * @param target the name of the item to restock
     * @param amount the amount to add to the stock of the target item
     */
    public static void restockItem(
            String[] names,
            int[] stocks,
            String target,
            int amount) {

        // TODO: Implement this method on the feature-restock branch. (Alexander uql14) COMPLETE

        for(String name : names) {
            if( name != null && name.equals(target)) {
                int index = java.util.Arrays.asList(names).indexOf(name);
                stocks[index] += amount;
                System.out.println("Restocked " + amount + " units of " + target + ".");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
