public class Four_Oop_in_One_Code {
    public static void main(String[] args) {
        Human H =new Human();
        H.add(10,33);
        H.add(11,23.4,66.3);//Method Overloading
        People P=new People();
        P.add(10,20,30);//Method Overriding
        Society S=new Society();
        S.run();
        S.walk();

    }
}

 class Human { //Encapsulation

    public void add(int a ,int b){
        int c=a+b;
        System.out.println("Two int sum is :"+c);
    }
    public void add(double a ,double b,double c){ //Method Overloading
        double d=a+b+c;
        System.out.println("Method Overloading");
        System.out.println("Three double sum is :"+d);
    }
}
class People extends Human{
    public void add(int a ,int b ,int c){ //Method Overriding
        int d=a*b*c;
        System.out.println("Method Overriding");
        System.out.println("Three int Multiplication is :"+d);
    }
}

interface HumanNature{ // Abstraction
    void run();
    void walk();

}
class Society implements HumanNature{
    public void run(){
        System.out.println(" Abstraction...");
        System.out.println("The human is running");
    }
    public void walk(){
        System.out.println("The human is walking");
    }

}