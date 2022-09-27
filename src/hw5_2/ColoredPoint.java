package hw5_2;

public class ColoredPoint extends Point implements Colored {
    String color;
    @Override
    public String getColor() {
        return color;
    }
    //override
    public ColoredPoint(int x, int y, String color){
        super(x,y);
        this.color=color;
    }

    //getter
    public void setColor(String color) {
        this.color = color;
    }
    //override
    public boolean equals(Object o){
        if(o instanceof ColoredPoint){
            ColoredPoint other = (ColoredPoint) o;
            return super.equals(o) && color == other.getColor();
        }else{
            return false;
        }
    }
    //change x and y to get x and get y and add color
    public String toSting(){
        return "(" + getX() + "," + getY() + ")" + "color" + color;
    }
}
