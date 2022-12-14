public class Binary_Search_Floor {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        Binary(arr, 15);
        
    }
    static void Binary(int []arr,int key){
        int l=0,h=arr.length-1;
        int  mid=0;
        while(l<=h){
             mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println(arr[mid]);
                break;
            }
             else if(key>arr[mid]){
                 l=mid+1;
             }
             else{
                h=mid-1;
             }

        }
        if(l>h){
            System.out.println(arr[h]);
            
        }

    
    }
}
