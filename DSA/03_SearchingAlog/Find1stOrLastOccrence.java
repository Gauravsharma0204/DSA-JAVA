import java.util.*;
public class Find1stOrLastOccrence{
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
            LinearSearch(arr, 2, true); //Find the Last occurrence 

            System.out.println();
            LinearSearch(arr, 2, false); // Find the first occurrence 
          
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }

      public static void LinearSearch(int arr[], int target, boolean findLast) {
            int ans = -1;
          for (int i = 0; i < arr.length; i++) {
              if(arr[i] == target){
                 
                  ans = i;
                  if(findLast == false){
                        break;
                  }
                  
              } 
          }
          if(ans == -1){
            System.out.println("Not Found");
          } else {
             System.out.println("Your Element is Founded : " + ans);
          }
      }
      
}