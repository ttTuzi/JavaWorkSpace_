package Lab13;
import java.util.*;
//Name:Wei Liang
//Panther Id:*****7082
//Due date:April 12
//Title: lab13 task1, 2
public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Character>Wei = new ArrayList<Character>();
        Wei.add('w');
        Wei.add('e');
        Wei.add('i');
        Wei.add('w');
        Wei.add('e');
        Wei.add('i');
        ArrayList<Character>Wei1 = new ArrayList<Character>();
        Wei1.add('w');
        Wei1.add('e');
        Wei1.add('i');
        RedundantCharacterMatch(Wei);
        RedundantCharacterMatch(Wei1);


    }

    public static void RedundantCharacterMatch(ArrayList<Character>Wei){
        ArrayList<Character> store = new ArrayList<Character>();
        int num=0;   //initial the variable
        for(char i='a'; i<='z'; i++){   // use for and if loop to check numbers of different letter
            if(Wei.contains(i)){
                num++;
            }
        }
        for(int i=0; i<num;i++){   //num of loop is less than num of different letter
            System.out.print(Wei.get(i)+":" );  // print out different letter each time
            for(int j=i;j<Wei.size();j++) {   // use nest for loop and if loop to compare does letter repeats
                if (Wei.get(i).equals(Wei.get(j))) {  // if they are same print out j
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }
    }

}
