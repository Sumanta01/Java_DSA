import java.util.Scanner;

public class fibbonacci  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=2;

        while(c<=n){
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
        System.out.println(b);
    }
}
