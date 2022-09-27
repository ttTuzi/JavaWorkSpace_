package finalTest;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 letter");
        String get = input.next();
        System.out.println(get);
        Replace(get);
    }

    public static void Replace(String get){
        char x=' ';
        for(int i=0;i<4;i++){
            x=get.charAt(i);
            x+=1;
            System.out.print(x);
        }
    }
}
