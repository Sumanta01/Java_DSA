
import java.util.Arrays;
import java.util.Scanner;

public class findFirstLastelement {
    
    static int FirstIndex(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    

    static int LastIndex(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={5,7,7,8,8,10};
        int target=7;
        int[] res={FirstIndex(arr, target),LastIndex(arr, target)};
        System.out.println(Arrays.toString(res));


    }
    
}
