    import java.util.*;
 public class Bitwise_Operator_1 {
     public static void main(String[] args) {
        
    //      System.out.println(a&b);
    //      System.out.println(a|b);
    //      System.out.println(a^b);
    //      System.out.println(~a);
           int a=5; 
           int b=6;
         System.out.println(a<<2);
         System.out.println(a>>2);
    //      System.out.println(a>>>2);

           Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              if((n&1)==1){
                 System.out.println("Odd");
              }
                else{
                     System.out.println("Even");
                }
     }
 }
