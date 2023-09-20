import java.util.Scanner;
public class Hello {

    private  String cid;
    private  String  cname;
    private long phno;
    private String city;
    private double unitconsumed;
    private double costperunit;
    public Hello(String cid, String cname, long phno, String city, double unitconsumed, double costperunit) {
        this.cid = cid;
        this.cname = cname;
        this.phno = phno;
        this.city = city;
        this.unitconsumed = unitconsumed;
        this.costperunit = costperunit;
    }
    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public long getPhno() {
        return phno;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public double getUnitconsumed() {
        return unitconsumed;
    }
    public void setUnitconsumed(double unitconsumed) {
        this.unitconsumed = unitconsumed;
    }
    public double getCostperunit() {
        return costperunit;
    }
    public void setCostperunit(double costperunit) {
        this.costperunit = costperunit;
    }
    public double calculateECBill(){
        return unitconsumed*costperunit;
    }


    
}

