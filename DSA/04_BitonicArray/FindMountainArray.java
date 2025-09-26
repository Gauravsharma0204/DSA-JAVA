
// public int findMoutainArray(int target, MountainArray mountainArr){
//       int n = mountainArr.length();
//       int start = 0;
//       int end = n-1;
//       int mid = -1;

//       while(start <= end){
//             mid = start + (end - start) / 2;
//             int cur = mountainArr.get(mid);
//             if(mid != 0 && mid != n-1 && cur > mountainArr.get(mid-1) && cur > mountainArr.get(mid+1)){
//                   if(cur == target){
//                         return mid;
//                   }
//                   break;
//             } else if(mid != n-1 && cur < mountainArr.get(mid+1)){
//                   start = mid+1;
//             } else {
//                   end = mid - 1;
//             }
//       }
//       start = 0;
//       end = mid;
//       while(start <= end){
//             int m = start + (end - start) / 2;
//             int cur = mountainArr.get(m);
//             if(cur == target){
//                   return m;
//             } else if(target < cur){
//                   end = m - 1;
//             } else {
//                   start = m + 1;
//             }
//       }
// }


/************************************************************************* */

import java.util.*;

interface MountainArray {
    public int get(int index);
    public int length();
}

// Dummy implementation for testing
class MyMountainArray implements MountainArray {
    private int[] arr;

    public MyMountainArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

class Solution {
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // Step 1: Find the peak index
        int peak = findPeak(mountainArr, n);

        // Step 2: Search in the left half (ascending order)
        int left = binarySearch(mountainArr, 0, peak, target, true);
        if (left != -1) return left;

        // Step 3: Search in the right half (descending order)
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);
    }

    // Function to find peak index in mountain array
    private int findPeak(MountainArray arr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1; // Move right (increasing slope)
            } else {
                end = mid; // Move left (decreasing slope or peak found)
            }
        }
        return start; // Peak index
    }

    // General binary search function
    private int binarySearch(MountainArray arr, int start, int end, int target, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int cur = arr.get(mid);

            if (cur == target) return mid;

            if (asc) { // Ascending order
                if (target < cur) end = mid - 1;
                else start = mid + 1;
            } else {   // Descending order
                if (target < cur) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1; // Target not found
    }
}

public class FindMountainArray {
    public static void main(String[] args) {
        // Example mountain array: strictly increasing then decreasing
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        MountainArray mountainArr = new MyMountainArray(arr);

        Solution sol = new Solution();

        int target = 3;
        int index = sol.findInMountainArray(target, mountainArr);

        System.out.println("Target " + target + " found at index: " + index);
    }
}
