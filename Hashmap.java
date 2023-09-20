import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        //Inserting
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");
        hm.put(6,"six");
        hm.put(7,"seven");
        hm.put(8,"eight");
        hm.put(9,"nine");
        System.out.println(hm);
        hm.put(5,"Fifty");
        System.out.println(hm);

        //Traversing
        for(Map.Entry<Integer,String>entry:hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //Search
       System.out.println(hm.containsKey(5));
       System.out.println(hm.containsValue("EIGHT"));
       System.out.println(hm.get(3));
       System.out.println(hm.get(10));
       
         //Remove
         hm.remove(5);
            System.out.println(hm);
      
        


    }
    
}
