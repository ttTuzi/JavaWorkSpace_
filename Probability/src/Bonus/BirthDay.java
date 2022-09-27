package Bonus;
import java.util.*;
public class BirthDay {

    public static void main(String[] args) {
        Random rand = new Random();
        //int[] arr = new int[364];
        int[] p = new int[364];
        //try 100time to get probability
        for(int t=0;t<100;t++){
            //total 365 student
            for(int i=0;i<365;i++){
                int[] arr = new int[365];
                //probability of i student has same birth day
                for(int j=0;j<i;j++){
                    int r = rand.nextInt(364);
                    arr[r]++;
                }
                //when they has same birth day p[] increase by 1
                if(repeat(arr)==true){
                    p[i]++;
                }
            }
        }
        tostring(p);
    }


    public static void tostring(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("The probability of "+(i+1)+" student has same birth day is nearly "+(arr[i])+" percent ");
        }
    }

    //to distinguish of students has same birthday
    public static boolean repeat(int[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=2){
                 return true;
            }
        }
        return false;
    }
}
