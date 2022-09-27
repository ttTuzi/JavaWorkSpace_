package finalTest;

public class Client {
    public static void main(String[] args) {
        Student Alex = new Student(170,150,"CS",3.4,54);
        Doctor Jack = new Doctor(173,179,4,"Dermatology");
        System.out.print("Alex: ");
        System.out.print(Alex.getMajor()+" ");
        System.out.print(Alex.getGpa()+" ");
        System.out.print(Alex.grtYear()+" ");

        System.out.print("Jack: ");
        System.out.print(Jack.getSpeciality()+" ");
        System.out.print(Jack.getHeight()+" ");
        System.out.print(Jack.getWeight()+" ");
        System.out.print(Jack.getSalary());
    }
}
