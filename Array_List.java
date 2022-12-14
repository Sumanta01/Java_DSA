import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer>list=new ArrayList<>(10);
        list.add(12);
        list.add(122);
        list.add(654);
        list.add(19363);
        list.add(175);
        list.add(5434);
        list.add(6549);
        list.add(4321);
        list.add(97785);
        list.add(6654);
        list.add(11123);
        list.add(8866);
        System.out.println(list);
        System.out.println(list.contains(4321));8
        System.out.println(list.contains(875476));
        System.out.println(list.set(1, 666));
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
    }
    
}
