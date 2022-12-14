import java.util.Scanner;

public class Binary_Search_celling {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int []arr={2,3,5,9,14,16,18};
        Binary(arr, 8);
    }
    static void Binary(int []arr,int key){
        int l=0,h=arr.length-1;
        int  mid=0;
        while(l<=h){
             mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println(arr[mid]);
                break;
            }
             else if(key>arr[mid]){
                 l=mid+1;
             }
             else{
                h=mid-1;
             }

        }
        if(l>h){
            System.out.println(arr[l]);
            
        }

    }
    
}
