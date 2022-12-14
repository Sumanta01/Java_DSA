 import java.util.*;
public class Greeting {
    static String Message( String name){
        String msg="Hello "+name;
        return msg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.next();
        String wc=Message(str);
        System.out.println(wc);

    }
    
}
