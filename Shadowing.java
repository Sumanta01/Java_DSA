public class Shadowing {
    static int x=99;
    public static void main(String[] args) {
        System.out.println(x);//99
        int x=50;
        System.out.println(x);//50
        fun();
    }

    static void fun(){
        System.out.println(x);//99
    }
    
}
