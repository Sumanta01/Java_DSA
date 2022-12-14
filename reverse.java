import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n/=10;
        }

        //System.out.println("The sum of digit is: "+sum);
        System.out.println(sum);
    }
    
}
