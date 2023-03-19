 import java.util.*;
public class Reverse_Sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            rev+=arr[i]+" ";
        }
        System.out.println(rev);
    }
}
