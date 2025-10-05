import java.util.*;

public class AggressiveCows {

    // ✅ Solve function to find maximum minimum distance
    public static int solve(int n, int cows, int[] stalls) {
        if (stalls.length < cows) {
            return -1; // Not enough stalls for all cows
        }

        Arrays.sort(stalls); // Sort stall positions

        int start = 1; // Minimum possible distance
        int end = stalls[n - 1] - stalls[0]; // Maximum possible distance
        int ans = -1;

        // Binary search on the answer
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAllocationPossible(stalls, mid, cows)) {
                ans = mid;       // mid is a possible answer
                start = mid + 1; // try for a larger minimum distance
            } else {
                end = mid - 1;   // try smaller distance
            }
        }
        return ans;
    }

    // ✅ Helper function to check if cows can be placed with at least minDistance
    static boolean isAllocationPossible(int stalls[], int minDistance, int cows) {
        int cowsCount = 1;  // place first cow at stalls[0]
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDistance) {
                cowsCount++;
                lastPos = stalls[i];
            }
            if (cowsCount >= cows) {
                return true; // all cows placed successfully
            }
        }
        return false; // not enough distance
    }

    // ✅ Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stalls: ");
        int n = sc.nextInt();

        System.out.print("Enter number of cows: ");
        int cows = sc.nextInt();

        int[] stalls = new int[n];
        System.out.println("Enter stall positions: ");
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }

        int result = solve(n, cows, stalls);
        System.out.println("Maximum minimum distance between cows: " + result);

        sc.close();
    }
}
