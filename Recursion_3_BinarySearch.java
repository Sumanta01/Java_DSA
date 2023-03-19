
import java.util.Scanner;

public class Recursion_3_BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(Binary_search(arr,key,0,n-1));

    }
    
    static int Binary_search(int []arr,int key,int beg,int end){
        if(beg>end){
            return -1;
        }
        int mid=beg+(end-beg)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(key<arr[mid]){
            Binary_search(arr, key, beg, mid-1);
        }
        return Binary_search(arr, key, mid+1, end);


    }
}
