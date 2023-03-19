import java.util.*;
 public class Missing_Number {
    //Missing Number Amazon  question   leetcode-268
     
    public static int  missingnumber(int[]arr){
        int i=0;
        while(i<arr.length){
            int  correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;

    }
    static void swap(int []arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={4,0,2,1};
        System.out.println(missingnumber(arr));
       
    }
    
}
