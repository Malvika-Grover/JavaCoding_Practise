package GroverMalvika;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 2; i <= 8 ; i++){
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", loopsChallenge(10000.00, i)));
        }
        System.out.println(" ------------------------------------------------------ ");
         for (int i = 8; i >= 2 ; i--){
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", loopsChallenge(10000.00, i)));
        }

    }
    public static double loopsChallenge(double amount, double interest){
        return (amount * (interest/100));
    }
}
//String.format("%.2f", <xyz -thing you want to format>)
// xyz will be formatted with maximum of 2 flot digits i.e, 9.00


