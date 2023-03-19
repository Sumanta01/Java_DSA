public class Bitwise_Operator_2{
     public static void main(String[] args) {
        int[]arr={1,22,3,44,22,1,4,3,44};
        System.out.println(ans(arr));
     }
     static int ans(int[]arr){
        int res=0;
        for(int i :arr){
            res=res^i;
        }
        return res;
     }
}
