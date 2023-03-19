public class Main {
    public static void main(String[] args) {
    //     Box box=new Box();
    //     System.out.println(box.l+" "+box.w+" "+box.h);
    //     Box box2=new Box(5);
    //     System.out.println(box2.l+" "+box2.h+" "+box2.w); 
    //     Box box3=new Box(5,8,11);
    //     System.out.println(box3.l+" "+box3.h+" "+box3.w);
    //     Box box4=new Box(box);//Copy Constructor
    //     System.out.println(box4.l+" "+box4.h+" "+box4.w);
    //     Box_Size box5=new Box_Size();
    //     System.out.println(box5.l+" "+box5.w+" "+box5.size);
            Box box6 =new Box_Size(5,6,89,9);
            System.out.println(box6.l+" "+box6.w+" "+box6.h);
            box6.display();
}
}
