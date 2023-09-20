import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {

    static int partition(int l,int h,int []arr){
        int i=l-1;
        int pivot=arr[h];
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[h]=temp;

        return i;
    }
    static void quickAlgo(int l,int h, int []arr){
        if(l<h){
            int pivot=partition(l, h, arr);
            quickAlgo(l, pivot-1, arr);
            quickAlgo(pivot+1, h, arr);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickAlgo(0, n-1, arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
