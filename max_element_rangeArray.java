import java.util.Arrays;
import java.lang.*;
public class max_element_rangeArray {
    public static void main(String[] args) {
        int []arr={12,34,56,5,76,32,21};
       System.out.println(max(arr));
       System.out.println(Max_Range(arr, 0, 3));
     
    }
    

    static int max(int []arr){
        int maxVal=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
        
    }
    static int Max_Range(int []arr,int beg,int end){
        int maxVal=arr[beg];
        for(int i=beg;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    
}
