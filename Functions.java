import java.util.Scanner;

public class Functions {
   static void sum(int n1 ,int n2){
    //  Scanner sc=new Scanner (System.in) ;  
    //  int n1=sc.nextInt();
    //  int n2=sc.nextInt();
    //  int sum=n1+n2 ;
    int sum=n1+n2;
     System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        sum(x,y);
        

    }
}
