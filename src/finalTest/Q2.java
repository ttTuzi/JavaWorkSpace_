package finalTest;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int[][] x = new int[6][10];
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int num = rand.nextInt(1100) + 11;
                x[i][j] = num;
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        Count_1(x);
        Max_Num_1(x,Count_1(x));
    }
    public static int[] Count_1(int[][]x){
        int [] y= new int [10];
        int r =0;
        System.out.print("1st of each col: ");
        for(int i=0;i<10;i++){
           y[i]= x[0][i];
           r=y[i];
           System.out.print(r+" ");
        }
        System.out.println(" ");
        return y;
    }

    public static  void Max_Num_1(int[][]x, int[]y){
        int i;
        int c=0;
        int r=0;
        int max = y[0];
        for (i = 1; i < 10; i++) {
            if (y[i] > max) {
                max = y[i];
                c=i;
            }
        }
        for(int j=0;j<6;j++){
            r = x[j][c];
            System.out.print(r+" ");
        }

    }
}
