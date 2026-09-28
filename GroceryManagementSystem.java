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
     * TODO: Add an appropriate Javadoc comment for this method.
     */
    public static void printInventory(
            String[] names,
            double[] prices,
            int[] stocks) {

        // TODO: Implement this method on the feature-display branch. (FEATURE-DISPLAY TEAMMATE)
                        
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