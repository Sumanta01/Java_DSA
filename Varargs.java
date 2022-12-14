import java.util.Arrays;
import java.util.TooManyListenersException;
import java.util.function.ToDoubleBiFunction;

public class Varargs {
    public static void main(String[] args) {
        fun(65,77,43,87,98,43,34,21);
        fun("how are you","hello world");
        
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(String...s){
        System.out.println(s.length);
    }
    
}
