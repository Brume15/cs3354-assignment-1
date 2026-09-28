/**
 * TODO: Add an appropriate Javadoc comment for this class.
 */
public class GroceryManagementSystem {

    /**
     * TODO: Add an appropriate Javadoc comment for this method.
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];   

        // TODO: Implement the user menu on the feature-menu branch. (FEATURE-MENU TEAMMATE)
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
     * TODO: Add an appropriate Javadoc comment for this method.
     */
    public static void restockItem(
            String[] names,
            int[] stocks,
            String target,
            int amount) {

        // TODO: Implement this method on the feature-restock branch. (Alexander uql14) COMPLETE

        for(String name : names) {
            if(name.equals(target)) {
                int index = java.util.Arrays.asList(names).indexOf(name);
                stocks[index] += amount;
                System.out.println("Restocked " + amount + " units of " + target + ".");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
