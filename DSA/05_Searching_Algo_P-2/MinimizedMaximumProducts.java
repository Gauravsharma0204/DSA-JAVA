
class MinimizedMaximumProducts {

    // Main function to minimize the maximum number of products in any store
    public int minimizedMaximum(int n, int[] quantities) {
        int start = 1; // minimum possible max products per store
        int end = Integer.MIN_VALUE; // to store max value in quantities

        // Find the maximum quantity from the list
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > end) {
                end = quantities[i];
            }
        }

        int res = -1; // final answer (minimized maximum)
        
        // Binary search to find the minimum possible max products per store
        while (start <= end) {
            int mid = start + (end - start) / 2; // candidate maximum products per store
            
            // Check if it is possible to distribute with this max limit
            if (isDistributionPossible(quantities, mid, n)) {
                res = mid;       // store current result
                end = mid - 1;   // try to minimize further
            } else {
                start = mid + 1; // need to increase max limit
            }
        }
        return res;
    }

    // Helper function to check if distribution is possible
    boolean isDistributionPossible(int quantities[], int maxProducts, int stores) {
        int storeCount = 0;
        
        for (int i = 0; i < quantities.length; i++) {
            // ceil division: how many stores needed for this product type
            storeCount += (quantities[i] + maxProducts - 1) / maxProducts;
            
            // If required stores exceed available stores, return false
            if (storeCount > stores) {
                return false;
            }
        }
        return true; // distribution possible within given store count
    }

    // ✅ Main method to test the solution
    public static void main(String[] args) {
        MinimizedMaximumProducts sol = new MinimizedMaximumProducts();

        int n1 = 6;
        int[] quantities1 = {11, 6};
        System.out.println("Output: " + sol.minimizedMaximum(n1, quantities1)); 
        // Expected: 3

        int n2 = 7;
        int[] quantities2 = {15, 10, 10};
        System.out.println("Output: " + sol.minimizedMaximum(n2, quantities2)); 
        // Expected: 5

        int n3 = 1;
        int[] quantities3 = {100000};
        System.out.println("Output: " + sol.minimizedMaximum(n3, quantities3)); 
        // Expected: 100000
    }
}
