import java.util.*;
public class Star_Pattren {
    static void pattern_2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            }
            for(int k=i;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern(int n){
        
       // for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                pattern_2(n);
            }
             
         }
       // }
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
    Pattern(n);

    
}
}