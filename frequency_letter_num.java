import java.util.Scanner;

public class frequency_letter_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(n>0){
            int r=n%10;
            if(r==b){
              count++;
            }
            n/=10;
            
        }
        System.out.println(count);
    }
}
