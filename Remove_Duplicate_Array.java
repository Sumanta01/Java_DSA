import java.util.Scanner;

public class Remove_Duplicate_Array {

    static void removeDuplicate(int []arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=i;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        removeDuplicate(arr, n);
        
    }
    
}
