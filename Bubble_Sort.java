import java.util.Arrays;

public class Bubble_Sort {
    static void Bubble(int []arr){
        boolean count=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    count=true;
                }
            }
            if(count==false){
                break;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        //}
    }
    public static void main(String[] args) {
        int[]arr={12,4,-21,3,7,-65,34,0,27,8,98};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
