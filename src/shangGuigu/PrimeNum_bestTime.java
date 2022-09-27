package shangGuigu;

public class PrimeNum_bestTime {
    public static void main(String[] args) {
        //time complex
        long start = System.currentTimeMillis();
        boolean isPrime ; //initial prime
        int count = 0;  //to count number of prime
        for(int i=2; i<=100000;i++){
            isPrime=true;  //initial prime is ture
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){       //if a number i can be even divid then it is not prime
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){  //if isprime does not go into the previous loop then mean it is a prime
                count++;   //count the prime number
                System.out.println(i);
            }

        }
        System.out.println("Number of prime number is "+count);
        long end = System.currentTimeMillis();
        System.out.println("time is " + (end-start));   //calculate time
        System.out.println(123 %10);
    }
}
