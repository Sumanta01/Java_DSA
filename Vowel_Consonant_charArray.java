import java.util.Scanner;

public class Vowel_Consonant_charArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char []arr=str.toCharArray();
        int vowel=findVowel(arr);
        int consonant=findConsonant(arr);
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonant: "+consonant);
        
    }

    static int findVowel(char []arr){
        int count=0;
        System.out.println("The Vowels are : ");
        for(char c:arr){
            if(isVowel(c)){
                System.out.print(c+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    static int findConsonant(char []arr){
        int count=0;
        System.out.println("The consonant's are :");
        for(char c:arr){
            if(!isVowel(c)){
                System.out.print(c+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) !=-1;
    }
}


