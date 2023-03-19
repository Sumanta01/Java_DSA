public class Box_Size extends Box{
    double size;
    Box_Size(){
       this.size=-5;
       
    }
    Box_Size(double l,double h,double w,double size){
        super(l,h,w);//call the parent class constructor
        //used to initialize the value in parent class       
        this.size=size;
    }

    
}
