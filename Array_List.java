import java.util.ArrayList;



import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        //Syntax
        List<Integer>l=new ArrayList<>(10);
        for(int i=0;i<10;i++){
            l.add(i);
        }
        System.out.println(l);
        System.out.println(l.get(5));
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(5));
        System.out.println(l.indexOf(5));
        System.out.println(l.lastIndexOf(5));
        System.out.println(l.remove(5));
        

    }
    
    
    
    
}

