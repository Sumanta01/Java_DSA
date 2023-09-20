abstract class Human{
    abstract void makeSound();

    public void eat(){
        System.out.println("I can eat");
    }

}

class Men extends Human{
    public void makeSound(){
        System.out.println("Very loudly Voice....");
    }
}

class Women extends Human{
    public void makeSound(){
        System.out.println("Very sweet Voice....");
    }
}


public class Abstarction {
public static void main(String[] args) {
    //Human h = new Human();//this is not possible because it's an absraction and
    //we cannot create object of the abstraction type directly, we have to use its child classes only
    Human m=new Men();
    m.eat();
    m.makeSound();
    Human w=new Women();
    w.eat();
    w.makeSound();
}
    
}
