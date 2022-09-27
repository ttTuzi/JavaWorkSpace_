package quiz;
import java.util.*;
public class Part {
        Random x = new Random();

        double lenght;
        String shape;
        String name;
        int fame = x.nextInt(100)+1;

    public Part() {
    }

    public Part(double lenght, String shape, String name) {
        this.lenght = lenght;
        this.shape = shape;
        this.name = name;
    }

    public Part(double lenght, String shape, String name, int fame) {
        this.lenght = lenght;
        this.shape = shape;
        this.name = name;
        this.fame = fame;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFame() {
        return fame;
    }

    public void setFame(int fame) {
        this.fame = fame;
    }

    public double CaculateSize(){
        return 0;
    }

    public String toString(){
        return getName()+","+getShape()+","+getFame()+","+getLenght();
    }

    public int FameCaculate(){
        return getFame();
    }

}
