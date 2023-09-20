import java.util.*;

public class Anagram_String {

    static void sort(char [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner ec=new Scanner(System.in);
        String str1=ec.nextLine();
        String str2=ec.nextLine();
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }



    }
    
}
