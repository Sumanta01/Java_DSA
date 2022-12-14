
public class Linear_Search {
   static int Linear(int []arr,int key){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
         }
         return -1;
   }
   public static void main(String[] args) {
        int []arr={12,455,677,34,65,76,34,56,99,72};
        int ans=Linear(arr, 65);
        System.out.println(ans);
   }
    
}
