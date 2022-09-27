package hw;

public abstract class Ticket {
    //use static to make number unique
    private static int number=0;
    private int ID;
    //constructor
    public Ticket(){
        number++;
        ID=number;
    }
    //getter
    public int getID() {
        return ID;
    }
    //abstract method
    public abstract double getPrice();
    public abstract String toString();
}
