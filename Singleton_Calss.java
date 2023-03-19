public class Singleton_Calss {
    private static Singleton_Calss instance;

    public static Singleton_Calss getInstance(){
        if(instance==null){
            instance=new Singleton_Calss();
        }
        return instance;
    }
    
    
    public static void main(String[] args) {
       Singleton_Calss ob=Singleton_Calss.getInstance();
       Singleton_Calss ob2=Singleton_Calss.getInstance();
         System.out.println(ob);
         System.out.println(ob2);
    }
}
