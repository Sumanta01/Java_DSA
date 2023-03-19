import java.util.*;
public class String_Methods {
    public static void main(String[] args) {
        String name="Sumanta Swain";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(3));
        System.out.println(name.toUpperCase());
        System.out.println(name.hashCode());
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
       System.out.println( name.getBytes());
    }
    
}
