import java.util.Scanner;

public class sum_of_digit_until_single_digit {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum;
     if(n!=0){
      sum=n%9==0?9:n%9;
     }
     else{
        sum=0;
     }
     System.out.println(sum);
}

}