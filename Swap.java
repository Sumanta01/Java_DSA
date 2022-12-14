import java.util.*;
public class Swap {
     int a,b;
      static void swap(Swap str){
        int temp=str.a;
         str.a=str.b;
         str.b=temp;
       //System.out.println(a);
       //System.out.println(b);
    }
    public static void main(String[] args) {
        Swap sw=new Swap();
        Scanner sc=new Scanner(System.in);
        sw.a=sc.nextInt();
        sw.b=sc.nextInt();
        sw.swap(sw);
        System.out.println(sw.a);
        System.out.println(sw.b);
    }
    
}
