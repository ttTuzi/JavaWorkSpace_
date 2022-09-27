package interfaceLesson;

public class Rect implements Shape {
    private double l;
    private double w;


    public Rect(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double perimeter() {
        return 2*l+2*w;
    }

    @Override
    public double area() {
        return w*l;
    }

    public String toString(){
        return "Rectangle";
    }
}
