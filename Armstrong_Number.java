import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // Armstrong(n);
        for(int i=100;i<1000;i++){
            if(Armstrong(i)){
                System.out.print(i+" ");
            }
        }
        
        
    }
    
   static boolean  Armstrong(int n){
    int temp=n;
    int sum=0,r;
    while(n>0){
        r=n%10;
        sum+=r*r*r;
        n/=10;

    }
     return sum==temp;
   }
   
   


 }

