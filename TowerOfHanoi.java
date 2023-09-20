import java.util.Scanner;

public class TowerOfHanoi {
    static void towerhanoi(char beg,char aux ,char end,int n){
        if(n==1){
            System.out.println("Move the disk from "+beg+" --> "+end);
        }
        else{
            towerhanoi(beg,end,aux,n-1);
            System.out.println("Move the disk from "+beg+" --> "+end);
            towerhanoi(aux,beg,end,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a,b,c;
        towerhanoi('A','B','C',n);
    }
    
}
