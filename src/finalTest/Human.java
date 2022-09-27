package finalTest;

public class Human {
    private double height;
    private double weight;

    public Human(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
