import java.util.Scanner;

public class FizzBuzz {
    static void checkFizzBuzz(int n){
        for(int i=1;i<=n;i++){
            String ans="";
            if(i%3==0){
                ans+="Fizz";
            }
            if(i%5==0){
                ans+="Buzz";
            }
            if(i%7==0){
                ans+="Bazz";
            }
            if(ans.isEmpty()){
                ans=Integer.toString(i);
            }
            System.out.println(ans);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkFizzBuzz(n);
    }
}
