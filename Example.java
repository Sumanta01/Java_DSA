public class Example extends Private_Static_Override{
     static  void show(){
        System.out.println("Sub class");
    }
    public static void main(String[] args) {
        
        Private_Static_Override pv=new Private_Static_Override();
        Private_Static_Override pv1=new Example();
        pv1.show();
        pv.show();

    }
}