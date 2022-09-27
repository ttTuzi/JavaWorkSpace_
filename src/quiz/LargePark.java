package quiz;

public class LargePark extends Part{
    String shape = "Circle";
    int fame= x.nextInt(50)+50;
    public LargePark(double lenght, String shape, String name, int fame) {
        super(lenght,shape,name,fame);
        shape=this.shape;
    }
    public void setLenght(double lenght) {
        if(lenght<20){
            this.lenght=20;
        }else{
            this.lenght=lenght;
        }
    }
}
