package finalTest;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        double[] Grade = new double[20];
        int[] Credit = new int [20];
        Random x = new Random();
        for(int i=0;i< Grade.length;i++){
            Grade[i]=x.nextInt(100)+1;
        }

        for(int i=0;i< Credit.length;i++){
            Credit[i]=x.nextInt(4)+1;
        }
        weighted_Average(Grade,Credit);
        double ave = weighted_Average(Grade,Credit);
        Evaluation(ave);
        System.out.println(Evaluation(ave));
    }

    public static double  weighted_Average(double[] Grade, int[] Credit){
        double x=0;
        for(int i=0; i< Grade.length;i++){
            x = x + Grade[i];
        }
        x = x/ Grade.length;
        System.out.println(x);

        double y =0;
        for(int i=0; i< Credit.length;i++){
            y = y + Credit[i];
        }
        y = y/Credit.length;
        System.out.println(y);
        return x;
    }

    public static String Evaluation(double x){
        if(x>90){
            return "A";
        }else if(x>80){
            return "B";
        }else if(x>70){
            return "C";
        }else if(x>60){
            return "F";
        }else{
            return "D";
        }
    }


}
