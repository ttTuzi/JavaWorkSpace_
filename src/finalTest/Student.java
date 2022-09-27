package finalTest;

public class Student extends Human{
    private String Major;
    private double gpa;
    private int CreditHour;

    public Student(double height,double weight, String major, double gpa, int creditHour) {
        super(height,weight);
        this.Major = major;
        this.gpa = gpa;
        this.CreditHour = creditHour;
    }

    public String getMajor() {
        return Major;
    }

    public double getGpa() {
        return gpa;
    }

    public String grtYear() {
        if(this.CreditHour<32){
            return "Freshman";
        }else if(this.CreditHour<64){
            return "Sophomore";
        }else if(this.CreditHour<96){
            return "Junior";
        }else{
            return "Senior";
        }
    }
}
