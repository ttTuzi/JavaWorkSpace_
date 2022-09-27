package quiz;
import java.util.*;
public class SmallPark extends Part{
    String shape = "square";
    Random x = new Random();
    int fame = x.nextInt(15)+5;
    public SmallPark(double lenght, String shape, String name){
        super(lenght, shape, name);
        shape=this.shape;
    }

    public SmallPark(double lenght, String shape, String name, int fame) {
        super(lenght,shape,name,fame);
        shape=this.shape;
    }

    public int FameCaculator(){
        return fame;
    }

}
