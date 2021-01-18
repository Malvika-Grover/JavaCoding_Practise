package GroverMalvika;

public class DigitSumChallenge {
    public static int sumDigit(int number){
        int sum = 0;
        if (number >= 10){
            while(number > 0){
                int digit = number % 10;
                sum = digit + sum;
                number = number / 10;
            }
        }else {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(123));
    }
}
