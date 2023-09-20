
public class Enums {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    
     Week(){
         System.out.println("Constructor is called for "+this.toString());
    }
}
    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        System.out.println(week);
        for(Week day:Week.values()){
            System.out.println(day);
        }
    }
}
