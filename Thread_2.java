public class Thread_2 implements Runnable{

    public void run(){
        System.out.println("Thread is running.....");
    }
    

public static void main(String[] args) {
    Thread_2 t2=new Thread_2();
    Thread t=new Thread(t2);
    t.start();
}

}