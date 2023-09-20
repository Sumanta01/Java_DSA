class Coder{
    
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Coder [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        Coder c=new Coder();
        c.setId(2170199);
        c.setName("Sumanta");
        c.setSalary(35000);

        System.out.println(c);
    }
    

    
}
