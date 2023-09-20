import java.util.*;
public class Alpha_Pattern {

    static void Alpha(int n){
        int k=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)k);
            }
            k++;
            System.out.println();
        }
    }
    static void AlphaWhile(int n){
        int i=1;
        int j=65;
        while(i<=n){
            int k=1;
            while(k<=i){
                System.out.print((char)j);
                k++;

            }
           System.out.println();
            j++;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Alpha(n);
        AlphaWhile(n);
        
    }
    
}
