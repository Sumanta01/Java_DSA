import java.util.*;
public class Number_Disappeared {
    public List<Integer>findDisappearedNumber(int []nums){

        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
               ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int []nums,int i,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
    public static void main(String[] args) {
        Number_Disappeared nb=new Number_Disappeared();
        int []nums={4,3,2,7,8,2,3,1};
        System.out.println(nb.findDisappearedNumber(nums));
    }
    
}
