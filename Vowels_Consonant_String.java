import java.util.Scanner;

public class Vowels_Consonant_String {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(findConsonant(str));
        System.out.println(findVowel(str));
        
    }

    static int findVowel(String str){

        int count=0;
        System.out.println("The Vowels are :");
        for(char c:str.toCharArray()){
            if(isVowel(c)){
                System.out.print(c+" ");
                count++;
            }
        }
        System.out.println();
        return count;

    }
    static int findConsonant(String str){
        int count=0;
        System.out.println("The consonant's are :");
        for(char c:str.toCharArray()){
            if(!isVowel(c)){
                System.out.print(c+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;

    }
}
