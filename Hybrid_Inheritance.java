interface Swimmer{
    void swim();
}
interface Jumper{
    void jump();
}
class Animal{
    void run(){
        System.out.println("Running.........");
    }
}

class  Dog extends Animal{
    public void bark(){
        System.out.println("Barking........");
    }

}

class Rotten extends Dog implements Swimmer,Jumper{
        void color(){
        System.out.println("Rainbow color.......");
    }
    public void swim(){
        System.out.println("Swiming.....");
    }
    public void jump(){
        System.out.println("Jumping.....");
    }

}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Rotten rt=new Rotten();
        rt.run();
        rt.bark();
        rt.color();
        rt.swim();
        
        
    }
    
}
