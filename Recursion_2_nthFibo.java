 import java.util.*;
public class Recursion_2_nthFibo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fibo(n));
        
    }
     
    static int  Fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        return Fibo(n-1)+Fibo(n-2);
    }


}
