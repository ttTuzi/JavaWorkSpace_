package hw;


public class Student_Advance_Ticket extends Advance_Ticket {
    //override the constructor
    public Student_Advance_Ticket(int day) {
        super(day);
    }
    //override the method
    public double getPrice() {   //if day >=10 price 15, else 20
        if(getDay()>=10){
            return 15;
        }else{
            return 20;
        }
    }
    //overrider the method
    public String toString() {
        return "Number: "+getID()+", Price: "+getPrice()+"(ID required)";
    }
}
