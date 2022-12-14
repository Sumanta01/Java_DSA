public class Even_number_digit {
    public static void main(String[] args) {
        int []num={12,345,2,6,7896};
        System.out.println(find_nums(num));
    }
    static int find_nums(int []num){
        int count=0;
        for(int i:num){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
     static boolean even(int n){
        int num_of_digit=digit(n);
        return num_of_digit%2==0;
            
        

                  
    }
    static int digit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    
}
