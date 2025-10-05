public class SmallestDivisor {
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 9};
        int threshold = 6;

        int result = smallestDivisor(nums, threshold);
        System.out.println("Smallest Divisor = " + result);
        // ✅ Expected Output: 5
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 0;

        // Find the maximum element in nums
        for (int num : nums) {
            end = Math.max(end, num);
        }

        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isDivisionPossible(nums, mid, threshold)) {
                res = mid;
                end = mid - 1; // try smaller divisor
            } else {
                start = mid + 1; // need bigger divisor
            }
        }
        return res;
    }

    // Helper function to check if sum of divisions <= threshold
    static boolean isDivisionPossible(int[] nums, int divisor, int threshold) {
        int sumOfDivision = 0;
        for (int num : nums) {
            // Ceiling of (num / divisor) = (num + divisor - 1) / divisor
            sumOfDivision += (num + divisor - 1) / divisor;

            if (sumOfDivision > threshold) {
                return false; // early exit
            }
        }
        return true;
    }
}
