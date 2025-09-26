import java.util.*;
public class MinMaxValue{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
            System.out.print("Elements " + i + " : => ");
            arr[i] = sc.nextInt();
            }

            printArr(arr);
            // findMax(arr);
            findMin(arr);
      
            
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }
            
      public static void findMax(int arr[]){
            int max = Integer.MIN_VALUE;
            // int max = arr[0];
            for(int i = 0; i < arr.length; i++){
                  if(max < arr[i]){
                        max = arr[i];
                  }
            }
            System.out.println();
            System.out.println("Maximum Elements : " + max);
      }

       public static void findMin(int arr[]){
            // int min = Integer.MAX_VALUE;
            int min = arr[0];
            for(int i = 0; i < arr.length; i++){
                  if(min > arr[i]){
                        min = arr[i];
                  }
            }
            System.out.println();
            System.out.println("Minimum Elements : " + min);
      }
}