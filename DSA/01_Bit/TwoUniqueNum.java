public class TwoUniqueNum {

    public static void unique(int arr[]) {
        int n = arr.length;
        int res = 0;

        // Step 1: XOR of all numbers (gives XOR of two unique numbers)
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }

        // Step 2: Find rightmost set bit in res
        int setBit = 0, bit = 0;
        while (res != 0) {
            if ((res >> bit & 1) != 0) {
                setBit = bit;
                break;
            }
            bit++;
        }

        // Step 3: Divide numbers into two groups based on setBit
        int res1 = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] >> setBit & 1) != 0) {
                res1 = res1 ^ arr[i];
            }
        }

        // Step 4: Find the two unique numbers
        int num1 = res1;
        int num2 = res ^ res1;

        System.out.println("Two unique numbers are: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4, 6, 7};
        unique(arr);
    }
}
