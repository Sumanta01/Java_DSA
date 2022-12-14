import java.util.Arrays;

public class function_2 {
    public static void main(String[] args) {
        int []arr={12,33,54,87,65};
        changing(arr);
       System.out.println(Arrays.toString(arr));
       System.out.println(arr);
       System.out.println(arr[0]);

    }

    static void changing(int []cng){
        cng[0]=77;

    }
    
}
