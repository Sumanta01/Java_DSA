 public class Method_Overloading {


    int add(int a ,int b){
    return a+b;
  }
  public double add(double a,double b){
     return a+b;
  }
  
  public int add(int a,int b,int c){
    return a+b+c;
  }

}

 class MainCaps{
    public static void main(String[] args) {
        Method_Overloading  ca=new Method_Overloading();

        
        int res=ca.add(76,44,233);
        double res2=ca.add(45.32,77.1);
        int res3=ca.add(534,645);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    
    
    }
}
