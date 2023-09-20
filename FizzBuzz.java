import java.util.Scanner;

public class FizzBuzz {
    static void checkFizzBuzz(int n){
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            if(i%3==0){
                System.out.println("Fizz");
            }
            if(i%5==0){
                System.out.println("Buzz");
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkFizzBuzz(n);
    }
}
