public class abstract_Inhit extends Abstract_Demo {
    public abstract_Inhit(int age){
       super(age);
    }

    @Override
    public void Career() {
      
        System.out.println("The career is very bad what i think");
        
    }

    @Override
    public void Relation() {
        
        System.out.println("The relation is very bad when i fired from company");
    }

    public static void main(String[] args) {
        abstract_Inhit ai=new abstract_Inhit(33);
        ai.Career();
       // ai.Relation();
        Main_Abstract ma=new Main_Abstract(43);
        ma.Career();
       // ma.Relation();
       
        
       
    }
}
