
import java.util.Scanner;

public class LinearSearchIn2DArray{
      public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter The Numbers of Rows : " );  
          int row = sc.nextInt();

          System.out.print("Enter The Numbers of Columns : " );  
          int column = sc.nextInt();

          int arr[][] = new int[row][column];

          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                  System.out.print("Elements " + i + " " + j +" : => ");
                  arr[i][j] = sc.nextInt();   
            }    
          }

      //     LinearSearch(arr, 10);
             LinearSearch01(arr, 20, true); // Find the last Occurence
             LinearSearch01(arr, 20, false); // Find the First Occurence


            linearSearchMultiple2d(arr, 5);
      //     printArr(arr);


      }

// ********************Print the Array********************
      public static void printArr(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                  System.out.print(arr[i][j] + " "); 
            } 
             System.out.println();   
          }
      }


// ****************Linear Search****************************
      public static void LinearSearch(int arr[][], int target) {
            
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[i].length; j++) {
                        if(arr[i][j] == target){
                              System.out.println("Element found at position: [" + i + "][" + j + "] = " + arr[i][j]);
                              return;
                        }
                              
                  } 
            }
            System.out.println("Element not found!");
      }

// ******************************************************************************
public static void LinearSearch01(int arr[][], int target, boolean findLast) {
    int outer = -1;
    int inner = -1;

    for (int i = 0; i < arr.length; i++) {
        boolean found = false;
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
                outer = i;
                inner = j;
                if (findLast == false) { 
                    found = true; 
                    break;  // stop after first occurrence
                }
            }
        }
        if (found) break;
    }

    if (outer == -1) {
        System.out.println("Element Not Found!");
    } else {
        System.out.println("Element found at position: [" + outer + "][" + inner + "] = " + arr[outer][inner]);
    }
}

// *********************************************

    public static void linearSearchMultiple2d(int arr[][], int target){
//        int size = arr.length * arr[0].length;
        int size = 0;
        for(int i=0;i<arr.length;i++){
            size = size + arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k=0;

        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if(found == true){
                break;
            }
        }

        if(k == 0) {
            System.out.println("Element is not present in the array");
        } else {
            for(int i=0;i<k;i++) {
                System.out.println("Found element at pos: " + ans[i][0] + "," + ans[i][1]);
            }
        }
    }
  

}