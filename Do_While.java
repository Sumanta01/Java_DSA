import java.util.*;

public class Do_While {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number from 1-10 to see  the magic...!");
             n=sc.nextInt();
            switch(n){
            case 1:
            System.out.println("Gand mein ungli karna band kar maderachood....!");
            break;
            case 2:
            System.out.println("Abe chutiyaa.. hae kya ...!");
            break;
            case 3:
            System.out.println("Abe saalee... gandu hae kya... !");
            break;
            case 4:
            System.out.println("Abe Bhosidk... Apne Baap ko mat Sikha...!");
            break;
            case 5:
            System.out.println("Lauda...leno na mere.....!");
            break;
            case 6:
            System.out.println("Andhaa... hae kya laudee...!");
            break;
            case 7:
            System.out.println("Maa chudane... hae kya tere ko laudee...!"); 
            break;
            case 8:
            System.out.println("Mumee ....lega kya mera..!");
            break;
            default:
            System.out.println("Madarchod 1-10 number ko input dena hae tere ko...!");
            break;
         }
        System.out.println("Madarchood...! Do you want to continue...?");
        System.out.println("Press 1-10 to continue...!");
    
    }while(n!=9);
}
    
}
