package interfaceLesson;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return (a+b+c);
    }

    @Override
    public double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public String toString(){
        return "Triangle";
    }
}
