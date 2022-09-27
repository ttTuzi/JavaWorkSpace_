package ArraylistLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<Integer> pra = new ArrayList<Integer>();
        for(int i=1;i<= 5;i++){
            pra.add(2 * i);
        }
        int size = pra.size();
        for(int i=0; i<size;i+=2) {
            pra.add(i, 42);
        }
        System.out.println(pra);
        System.out.println("1");

        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("W",29);
        ages.put("We",28);
        ages.put("Wei",27);
        for(String name : ages.keySet()){
            int age = ages.get(name);
            System.out.println(name+age);
        }
    }
}
