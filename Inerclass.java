// class Test{
//    static  String name;
//     public Test(String name){
//         System.out.println("Test class constructor");
//         this.name=name;
//     }
// }

public class Inerclass {
    static class Test{
        static String name;
        public Test(String name){
            System.out.println("Test class constructor");
            this.name=name;
        }
    }
    
    public static void main(String[] args) {
        Test t=new Test("Sumanta");
        Test t2=new Test("Rock");
        System.out.println(t.name);
        System.out.println(t2.name);
    }
}
