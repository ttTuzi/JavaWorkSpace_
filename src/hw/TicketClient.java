package hw;
//Name:Wei Liang
//Panther Id:*****7082
//Due date:April 5
//Title: HW5 task 1
public class TicketClient {
    //just test the class
    public static void main(String[] args) {
        Walkup_Ticket a= new Walkup_Ticket();
        System.out.println(a);
        Student_Advance_Ticket b = new Student_Advance_Ticket(15);
        System.out.println(b);
        Advance_Ticket c = new Advance_Ticket(6);
        System.out.println(c);
    }
}
