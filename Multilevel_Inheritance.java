public class Multilevel_Inheritance {
    static void method(){
        System.out.println("Nothing is Permanent in life");
        System.out.println("This is a main class");
    }
}
class Situation extends Multilevel_Inheritance{
    static void method1(){
       System.out.println("This is a child class");
       System.out.println("Learn a lot of things after fired from company");
    }
}
class Struggle extends Situation{
    static void method2(){
        System.out.println("This is a grand child class");
        System.out.println("Hard work is the key to success");
        System.out.println("Never give up");
    }
    public static void main(String[] args) {
        Struggle s=new Struggle();
        s.method();
        s.method1();
        s.method2();
        
    }
}


