import java.util.*;
public class FindMultiValue{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
            System.out.print("Elements " + i + " : => ");
            arr[i] = sc.nextInt();
            }

            
            System.out.println();
            LinearSearch(arr, 2);
          
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }

      public static void LinearSearch(int arr[], int target) {
            int ans[] = new int[arr.length];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                  if(arr[i] == target){
                  ans[k] = i;
                  k++;
              } 
          }
          if(k == 0){
            System.out.println("Not Found");
          } else {
                  for(int i = 0; i < k; i++){
                        System.out.println("Your Element is Founded : " + ans[i]);
                  }
             
          }
      }
      
}