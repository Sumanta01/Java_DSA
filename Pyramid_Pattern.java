import java.util.Scanner;

public class Pyramid_Pattern {

    static void pattern(int n){
        int flag=1;
        int temp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=temp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=flag;k++){
                System.out.print("*");
                if(k<flag){
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            temp--;
            flag++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    
}
