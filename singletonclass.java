public class singletonclass {
    private static singletonclass Employee_id;
    private singletonclass(){
    }
    public static singletonclass getInstance(){
        if(Employee_id==null){
            Employee_id=new singletonclass();
        }
        return Employee_id;
    }
   public void Salary(){
    System.out.println("The salaray is 50000 rs per month");
   }
    
}
 class Main{
    public static void main(String[] args) {
        singletonclass sc;
        sc=singletonclass.getInstance();
        sc.Salary();
    }
}
