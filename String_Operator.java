import java.util.*;

public class String_Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');//195
        System.out.println("a"+"b");//ab
        System.out.println('a'+3);//100;
        System.out.println("a"+3);//a3
        System.out.println("a"+"1");//a1
        System.out.println("Happy"+new ArrayList<>());
        System.out.println("why"+new Integer(878));
        //System.out.println(new Integer(44)+ new ArrayList<>());
        String ans=new Integer(66)+ " " + new ArrayList<>();
        System.out.println(ans);
    }
    
}
