import java.util.*;

public class JumpSearch{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Size of Array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < arr.length; i++){
                  System.out.print("Enter Array " + i + " => ");
                  arr[i] = sc.nextInt();
            }
            System.out.println();

            printArr(arr);
            int printJump = jumpSearch(arr, 20);
            if(printJump == -1){
                  System.out.print("Not Found ");
            } else {
                  System.out.print("Found at " + printJump);
            }


      }

      public static void printArr(int arr[]){
            for(int i = 0; i < arr.length; i++){
                  System.out.println(arr[i] + " ");
            }
      }

      public static int jumpSearch(int arr[], int target){
            int n = arr.length;
            int blockSize = (int) Math.sqrt(n);
            int startIndex = 0;
            int endIndex = blockSize;

            // Skip / Jump the non - potential block..
            while(endIndex < n && arr[endIndex] <= target){
                  startIndex = endIndex;
                  endIndex += blockSize;
            
                  if(endIndex > n){
                        endIndex = n;
                  }
            }

            int res = -1;
            // Apply linear search
            for(int i = startIndex; i < endIndex; i++){
                  if(target == arr[i]){
                        res = i;
                  }
            }
            return res;
      }
}