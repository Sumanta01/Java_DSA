import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ReverseArray_List {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(i);
        }
        System.out.println(al);
       
       
        ArrayList<Integer>l=new ArrayList<>();
        for(int j=al.size()-1;j>=0;j--){
            l.add(j);
        }
       System.out.println(l);
        
    }
    
}
