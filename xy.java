public class xy {
    public static void main(String[] args) {
        int []arr={12,-57,23,2,1,-65,0,21,43,77,-52};
        Selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Selection(int []arr){
        for(int i=0;i<arr.length;i++) {
            int last=arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int[]arr,int first,int last){
        int max=first;
        for(int i=first;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int []arr,int first,int last){
       int temp=arr[first];
       arr[first]=arr[last];
       arr[last]=temp;
    
}
