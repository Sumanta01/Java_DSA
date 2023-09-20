import java.util.ArrayList;
import java.util.Scanner;

public class Starting_1_inarr {

   public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer>al=new ArrayList<>(n);
            for(int i=0;i<n;i++){
                al.add(sc.nextInt());
            }

           al.stream().map(s-> s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
             
        }
    
}
