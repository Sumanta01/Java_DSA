import java.util.*;
public class Insertion_sort {
    static void insertion(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j, j-1);
                }
                else{
                    break;
                }
            }
        }
    
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
    
}
