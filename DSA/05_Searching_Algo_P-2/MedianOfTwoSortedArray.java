import java.util.*;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first sorted array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first sorted array: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for second sorted array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second sorted array: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call function
        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        double median = obj.findMedianSortedArray(nums1, nums2);
        System.out.println("Median is: " + median);

        sc.close();
    }

    public double findMedianSortedArray(int nums1[], int nums2[]) {
        // Ensure nums1 is always the smaller array (for binary search efficiency)
        if (nums1.length > nums2.length) {
            return findMedianSortedArray(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;
        int start = 0, end = n1;
        int N = n1 + n2; // total elements

        // Binary search on smaller array (nums1)
        while (start <= end) {
            // Partition for nums1
            int cut1 = start + (end - start) / 2;

            // Partition for nums2 (so that left half + right half = total length)
            int cut2 = (N / 2) - cut1;

            // Left side elements (handle edge cases with MIN_VALUE)
            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            // Right side elements (handle edge cases with MAX_VALUE)
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            // ✅ Correct partition found
            if (l1 <= r2 && l2 <= r1) {
                // Case 1: If total elements are even → take average of middle two
                if (N % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
                // Case 2: If total elements are odd → take minimum of right side
                else {
                    return Math.min(r1, r2);
                }
            }
            // Move binary search left
            else if (l1 > r2) {
                end = cut1 - 1;
            }
            // Move binary search right
            else {
                start = cut1 + 1;
            }
        }
        return 0.0; // Should never reach here
    }
}
