package GroverMalvika;
public class PrimeNUmbers {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            //another way to do the same thing
      //for (int i = 2; i <= (long) Math.sqrt(n); i++)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 5; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("Number "+i+ " is the Prime Number");

            }
            else if(count==3) {
                System.out.println("Existing for loop");
                break;
            }
        }
    }
}
