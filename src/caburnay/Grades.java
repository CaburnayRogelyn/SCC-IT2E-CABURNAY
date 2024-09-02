package caburnay;

public class Grades {
    int sid;
    String sname;
    double p,m,pf,f,average;
    
    public void addGrades(int id,String name,double pre, double mid, double pref, double fin){
        this.sid = id;
        this.sname = name;
        this.p = pre;
        this.m = mid;
        this.pf = pref;
        this.f = fin;
    }
    
    public void viewGrades(){
        average = (this.p+this.m+this.pf+this.f)/4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s",this.sid,this.sname,this.p,this.m,this.pf,this.f,this.average,remarks);
    }
}
