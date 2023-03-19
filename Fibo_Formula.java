import java.util.*;
public class Fibo_Formula {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        // System.out.print(FibFormula(i)+" ");
       // }
        System.out.println(FibFormula(n));
    }
    static int FibFormula(int n){
        double phi=(1+Math.sqrt(5))/2;
        return (int)Math.round(Math.pow(phi, n)/Math.sqrt(5));
    }

 
}
