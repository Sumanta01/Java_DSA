import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();

        switch(fruit){
        case "Apple":
          System.out.println("It is a sweet red fruit:");
           break;
        case"Mango":
         System.out.println("It is the king of the fruit");
           break;
        case "Orange":
         System.out.println("It is the round fruit");
         break;
        case "Grapes":
         System.out.println("It is the small fruit");
           break;
        case "pinapple":
        System.out.println("It the unique fruit");
          break;
        default:
        System.out.println("Please enter the valid fruit name:");

        }
        


    }
    
}
