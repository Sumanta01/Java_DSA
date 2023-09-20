import java.util.Arrays;
import java.util.Scanner;

public class Product_Array_Expect_Self {
    public int []productArray(int []arr){
        int n=arr.length;
        int []left=new int[n];
        int right[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>-1;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Product_Array_Expect_Self pr=new Product_Array_Expect_Self();
        int []ans=pr.productArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    
}
