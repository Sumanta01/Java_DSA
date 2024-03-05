import java.util.Objects;

public class Student {
    private int id;
    private String name;

    Student(int id,String name){  // Initial the object using constructor
        this.id=id;
        this.name=name;
    }

    public  boolean equals(Object obj){
        // Check if same object reference
        if(this==obj){
            return  true;
        }
        // Check for null or different class
        if(obj==null || getClass()!=obj.getClass()){
            return  false;
        }
        // Cast to Person object
        Student st= (Student) obj;
        // Compare attributes
        return id==st.id && Objects.equals(st.name,name);
    }

    // implement the hashcode method
    public int hashCode(){
        return Objects.hash(id,name);
    }

    public static void main(String[] args) {
        Student st1=new Student(11,"Sumanta");
        Student st2=new Student(21,"Swati");
        Student st3=new Student(21,"Swati");

        System.out.println(st1.equals(st2)); //false (-193330917(st1) != 80295902(st2))
        System.out.println(st2.equals(st3)); // true (80295902(st1) = 80295902(st2))

        //hashCode() of every Object
        System.out.println(st1.hashCode()); // -193330917
        System.out.println(st2.hashCode()); // 80295902
        System.out.println(st3.hashCode()); // 80295902

    }
}
