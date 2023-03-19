public class Recursion {
    public static void main(String[] args) {
        print1(1);
        // print2(2);
        // print3(3);
        // print4(4);
        // print5(5);
    }
     static void print1(int n){
      if(n==5){
        System.out.println(n);
        return ;
      }
      System.out.println(n);
      print1(n+1);
       
      
     }
}
