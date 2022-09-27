package interfaceLesson;

public class ShapeClient {
    public static void main(String[] args) {
        Circle cir = new Circle(3);
        Rect r = new Rect(3,5);
        Triangle tri = new Triangle(3,4,5);
        printInfo(cir);
        printInfo(tri);
        printInfo(r);

    }

    public static void printInfo(Shape s){
        System.out.println("Shape is :"+s);
        System.out.println("area is : "+s.area());
        System.out.println("perimeter is : "+ s.perimeter());
        System.out.println();
    }
}
