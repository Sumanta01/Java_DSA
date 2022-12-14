import java.util.Arrays;

 import java.util.Arrays;
public class Swap_Index{
    public static void main(String[] args) {
        int []arr={12,347,88,44,8,54};
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }



    static void swap(int []arr,int index1,int index3){
        int temp=arr[index1];
        arr[index1]=arr[index3];
        arr[index3]=temp;


    }


}