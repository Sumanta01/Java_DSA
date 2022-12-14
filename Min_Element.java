import java.util.Scanner;

public class Min_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int b=min(arr);
       System.out.println(b);
    }
    

    static int min(int []arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
