package hw;

public class Walkup_Ticket extends Ticket{

    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return "Number: "+getID()+", Price: "+getPrice();
    }
}
