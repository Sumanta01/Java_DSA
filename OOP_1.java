import java.util.Arrays;

public class OOP_1 {
    public static void main(String[] args) {

        Student st=new Student();
        System.out.println(st.roll);
        System.out.println(st.name);
        System.out.println(st.marks);
        System.out.println(st.attn);
        // int arr[]=new int[5];
        // String str[]=new String[5];
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(str));
        st.greeting();
        st.changeName("Sumanta Swain is a Shoees lover");


    }
    
}

class Student{
    int roll;
    String name;
    double marks;
    boolean attn;

    void greeting(){
        System.out.println("Hello, I am "+this.name);
    }

    void changeName(String newName){
        this.name=newName;
    }

    Student(){
        this.roll=199;
        this.name="Sumanta Swain";
        this.marks=366;
        this.attn=true;
    }
    Student(int roll ,double marks,String name,boolean attn){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
        this.attn=true;
    }



}