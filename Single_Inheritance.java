public class Single_Inheritance {

    static void display(){
        System.out.println("This is a main class");
        System.out.println("Google");
    }
}

 class Faang extends Single_Inheritance{
       
    static void show(){
        System.out.println("This is a child class");
        System.out.println("Facebook");
        System.out.println("Amazon");
        System.out.println("Apple");
        System.out.println("Netflix");
    }
    public static void main(String[] args) {
        Faang f= new Faang();
        f.show();
        f.display();
       
        
    }

}
