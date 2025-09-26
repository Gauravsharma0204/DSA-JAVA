public class UniqueNum{


      public static void unique(int arr[]){
            int un = arr.length;
            int res = 0;
            for (int i = 0; i < un; i++) {
                res = res ^ arr[i];
            }
            System.out.println(res);
      }
      public static void main(String[] args) {
          int arr[] = {1,2,3,4,1,2,3,4,6,4};
          unique(arr);
      }
}