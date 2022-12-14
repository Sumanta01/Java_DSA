import java.util.Arrays;

public class Find_position_Of_element_in_sorted_array {
    public static void main(String[] args) {
        int []arr={5,7,7,7,7,8,8,10};
        int key=8;
        System.out.println( Arrays.toString(position(arr,key)));
        
    }
    

   static int []position(int []arr,int key){
    int []ans={-1,-1};
    int l=search(arr, key, true);
    int h=search(arr, key, false);
    arr[0]=l;
    arr[1]=h;
    return ans;
}


    static int search(int []arr,int key,boolean findstartindex){
    int ans=-1;
    int l=0;
    int h=arr.length-1;
    while(l<=h){
        int mid=l+(h-l)/2;
         if(key<arr[mid]){
            h=mid-1;
        }
        else if (key>arr[mid]){
            l=mid+1;
        }
        else{
            ans=mid;
            if(findstartindex){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
    }
    return ans;

    }


}