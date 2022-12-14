import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Erathunates {
    static void Prime_Sieve(int n){
        Boolean prime[]=new Boolean[n];
        Arrays.fill(prime, Boolean.FALSE);
        for(int i=2;i<=n-1;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n-1;j+=i){
                    prime[j]=true;
                }
            } 
        }
        for(int i=2;i<=n-1;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       Prime_Sieve(n);
    }
    
}
