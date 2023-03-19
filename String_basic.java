public class String_basic {
    public static void main(String[] args) {
        String str="Sumanta Swain";
       // System.out.println(str);
       String a="happy";
       System.out.println(a);
       a="face";
       System.out.println(a);
       
       String str1="Hello";
       String str2="Hello";
       String str3=new String("Hello");
       String str4=new String("Hello");
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str3==str4);//false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str3.equals(str4));//true
        System.out.println(str1.equals(str4));//false
       
    }
    
}
