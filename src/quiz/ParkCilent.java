package quiz;

public class ParkCilent {
    public static void main(String[] args) {
        SmallPark small = new SmallPark(10, "square", "small82");
        LargePark large = new LargePark(15, "Circle", "Large82", 100);
        System.out.println(small);
        System.out.println(large);
    }
}
