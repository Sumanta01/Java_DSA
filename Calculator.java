import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true){
        System.out.println("Enter the operator: ");
        char op=sc.next().trim().charAt(0);
        if(op=='+'|| op=='-'|| op=='*'||op=='/'|| op=='%'){
         System.out.println("Enter the first number: ");
         int n1=sc.nextInt();
         System.out.println("Enter the Second number: ");
         int n2=sc.nextInt();
         if(op=='+'){
            ans=n1+n2;
         }
         if(op=='-'){
            ans=n1-n2;
         }
         if(op=='*'){
            ans=n1*n2;
         }
         if(op=='/'){
            if(n2!=0){
                ans=n1/n2;
            }
         }
         if(op=='%'){
            ans=n1%n2;
         }
        }else if(op=='x'||op=='X'){
            break;
        }else{
          System.out.println("Invalid Operation!..");
        }
        System.out.println(ans);
    }
 }
}
