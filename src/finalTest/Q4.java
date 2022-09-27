package finalTest;

public class Q4 {
    public static void main(String[] args) {
        int i=9;
        int count=0;
       do{
           count++;
           i-=2;
           int j=i;
           if(count%2==0) {
               System.out.print("-");
           }
               while (j < 9) {
                   j += 2;
                   System.out.print(j);
               }
           System.out.println(" ");
        }while(i>=1);
    }
}
