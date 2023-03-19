import java.util.*;
public class Array_Exception {
    public static void main(String[] args) {
        try{
    Scanner sc=new Scanner(System.in);
    int  []arr=new int[-9];
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i:arr){
        System.out.println(arr[i]+" ");
    }
}catch (Exception e){
    System.out.println(e);
    System.out.println("Exception Handled");

}

}
}
