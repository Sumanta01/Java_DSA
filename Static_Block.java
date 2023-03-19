public class Static_Block {
    static int a=77;
    static int b;

    static{
        b=a*32;
        System.out.println("Static block initialized");
    }
    public static void main(String[] args) {
        Static_Block ob=new Static_Block();
        System.out.println("Value of a: "+Static_Block.a);
        System.out.println("Value of b: "+Static_Block.b);
            Static_Block.b+=10;
        Static_Block ob2=new Static_Block();
        System.out.println("Value of a: "+Static_Block.a);
        System.out.println("Value of b: "+Static_Block.b);
    }
    
}
