import java.util.*;
public class Gcd_Recursion {

    static int gcd(int a ,int b){
       if(a<b){
        return gcd(b,a);
       }
        int c=a%b;
        if(c==0){
            return b;
        }
        return gcd(b,c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));

    }
    
}
