public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr={3,5,7,9,10,90,100,130,140,160,170};
        int key=10;
        System.out.println(Ans(arr, key));
    }
    static int Ans(int []arr,int key){
        int beg=0;
        int end=1;
        while(key>arr[end]){
            int temp=end+1;
            end=end+(end-beg+1)*2;
            beg=temp;

        }
        return BinarySearch(arr, beg, end, key);
    }
    static int  BinarySearch(int []arr,int beg,int end,int key){
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(key>arr[mid]){
                beg=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
