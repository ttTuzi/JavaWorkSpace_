package hw5_2;
//Name:Wei Liang
//Panther Id:*****7082
//Due date:April 5
//Title: HW5 task 2
public class Client {
    public static void main(String[] args) {
        //create 4 ColoredPoint object
        ColoredPoint a = new ColoredPoint(1, 1, "red");
        ColoredPoint b = new ColoredPoint(1, 1, "red");
        ColoredPoint c = new ColoredPoint(1, 2, "red");
        ColoredPoint d = new ColoredPoint(1, 1, "green");

        //campare 2 object
        compare(a,b);
        compare(a,c);
        compare(a,d);
    }
    //create a compare method
    public static void compare(ColoredPoint a, ColoredPoint b){
        //use if loop to determine the situation
        if(a.equals(b)){  //if a=b then print out following sentence
            System.out.println("it is =");
        }else{  //if a not=b  or else then print out following sentence
            System.out.println("it is not =");
        }
    }

}
