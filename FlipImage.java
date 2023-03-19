import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {

         int [][]img={{1,1,0},{1,0,1},{0,0,0}};
            int [][]ans=Flip(img);
            for(int []row: ans){
                for(int  i: row){
                   //System.out.print(i+" ");
                 
                }
                 //  System.out.println();
                System.out.print(Arrays.toString(row));
            }
           
    }
    static int [][] Flip(int[][]img){
        for(int []row: img){
            for(int i=0;i<(img[0].length+1)/2;i++){

                int temp=row[i]^1;
                row[i]=row[img[0].length-i-1]^1;
                row[img[0].length-i-1]=temp;
            }
        }
        return img;

    }
}
