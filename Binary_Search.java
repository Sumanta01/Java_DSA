import java.util.Scanner;

public class Binary_Search {
    static void  Binarysearch(int arr[],int key){
        int beg=0;
        int end=arr.length;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(arr[mid]==key){
                System.out.println("The key elements is found in the index: "+mid);
                break;
            }
             else if(key>arr[mid]){
                beg=mid+1;
             }
             else{
                end=mid-1;
             }  
        }
        while(beg>end){
            System.out.println("The key element is not found in the array");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key element you want to search :");
        int key=sc.nextInt();
        Binarysearch(arr,key);






    }
    
}
