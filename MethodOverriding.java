

class Animal {
    public void makeNoise(){
        System.out.println("Animal is making noise");
    }
    
      public  void badSmell(){
        System.out.println("Animals are bad smeller");
 
    }

}

class Tiger extends Animal{
       
    public void makeNoise(){
        System.out.println("Tiger is also...");
        
    }

}

class Pig extends Animal{
    public void  badSmell(){
        System.out.println("Pigs have a bad odour.");
    }
}

class MethodOverriding{
    public static void main(String[] args) {
        Animal animal=new Animal();
        
        animal.badSmell();
        animal.makeNoise();

        Tiger tiger=new Tiger();
        tiger.makeNoise();
        tiger.badSmell();

        Pig pig=new Pig();
        pig.badSmell();
    }
}



