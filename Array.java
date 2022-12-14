import java.util.Arrays;

public class Array{
     public static void main(String[] args) {
        int  []arr=new int[6];
        System.out.println(arr);
       for(int i=0;i<6;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       System.out.println(Arrays.toString(arr));
       System.out.println();
       float []arr2=new float[12];
       for(int  j=0;j<12;j++){
        System.out.print(arr2[j]+" ");
       }
       System.out.println();
       System.out.println(Arrays.toString(arr2));
       System.out.println();
      String []arr3=new String[7];
         for(int  k=0;k<arr.length;k++){
            System.out.print(arr3[k]+" ");
         }
         System.out.println();
         System.out.println(Arrays.toString(arr3));

         
     }
}