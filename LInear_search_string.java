import java.util.Scanner;

public class LInear_search_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.next();
       char key=sc.next().charAt(0);
       boolean b=Linear_Search(str, key);
       System.out.println(b);
    }
    

    static boolean Linear_Search(String str,char key){
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)==key){
                return true;
             }
        }
        return false;
    }
}
