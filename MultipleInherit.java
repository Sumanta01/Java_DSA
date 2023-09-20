interface Player{
    void play();
}
interface Swimmer{
    void swim();
}
class Athlete implements Player,Swimmer{
    public void play(){
        System.out.println("Playing now....");
    }

    public void swim(){
        System.out.println("Swimming now.... ");
    }

}
public class MultipleInherit {
    public static void main(String[] args) {
        Athlete at=new Athlete();
        at.play();
        at.swim();
        

        
    }
    
}
