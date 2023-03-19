import java.util.*;
public class Int_to_Binary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));
    }

    static int SetBits(int n){
        int count=0;
        while(n>0){
            count++;
        
        n=n&(n-1);
        }
        return count;
    }
}