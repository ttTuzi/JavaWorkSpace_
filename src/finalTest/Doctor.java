package finalTest;

public class Doctor extends Human{
    private int years;
    private String speciality;

    public Doctor(double height, double weight, int years, String speciality) {
        super(height, weight);
        this.years = years;
        this.speciality = speciality;
    }

    public int getYears() {
        return years;
    }

    public String getSpeciality() {
        return speciality;
    }
    public int getSalary(){
        return 40000+this.years*5000;
    }
}
