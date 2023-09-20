import java.util.Scanner;

public class Hiii {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer id:  ");
        String cid=sc.nextLine();
        System.out.println("Enter Customer name:  ");
        String cname=sc.nextLine();
        System.out.println("Enter Customer phone number:  ");
        long phno=sc.nextLong();
        System.out.println("Enter Customer city:  ");
        String city=sc.next();
        System.out.println("Enter Customer unit consumed:  ");
        double unitconsumed=sc.nextDouble();
        System.out.println("Enter Customer cost per unit:  ");
        double costperunit=sc.nextDouble();
        Hello h=new Hello(cid,cname,phno,city,unitconsumed,costperunit);
        double ecb=h.calculateECBill();
        System.out.printf("Amount to be paid is  Rs.%.2f%n ",ecb);



        

        

    }

    
    
}
