package hw;

public class Advance_Ticket extends Ticket{
    //create new field "day"
    private int day;
    //overrider the constructor
    public Advance_Ticket(int day){
        this.day=day;
    }
    //getter
    public int getDay() {
        return day;
    }
    //setter
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public double getPrice() {
        if(this.day>=10){
            return 30;
        }else{
            return 40;
        }
    }

    @Override
    public String toString() {
        return "Number: "+getID()+", Price: "+getPrice();
    }

}
