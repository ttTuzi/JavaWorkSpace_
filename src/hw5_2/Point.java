package hw5_2;
//given part in hw5
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        this.x=0;
        this.y=0;
    }

    public boolean equals(Object o){
        if(o instanceof Point){
            Point other = (Point) o;
            return x == other.x && y == other.y;
        }else{
            return false;
        }
    }

    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toSting(){
        return "(" + x + "," + y + ")";
    }
}
