public class Richest_Cutmoer_Wealth {
    public static void main(String[] args) {
        int [][]wlt={{1,2,3},{3,2,1}};
        int b=maximum_Wealth(wlt);
        System.out.println(b);
        
    }
    static int maximum_Wealth(int [][]wlt){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<wlt.length;i++){
            int sum=0;
            for(int j=0;j<wlt[i].length;j++){
                 sum+=wlt[i][j];
            }
                 if(sum>ans){
                    ans=sum;
                 }
            
        }
        return ans;
    }
    
}
