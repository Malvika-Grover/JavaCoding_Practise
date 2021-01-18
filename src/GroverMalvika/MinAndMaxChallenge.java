package GroverMalvika;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
        //Wrapper class
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean firstNumber = true;

        while (true){
            System.out.println("Enter Numbers: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
//                if (firstNumber){
//                    firstNumber = false;
//                    max = number;
//                    min = number;
//                }
                if (number > max) {
                    max = number;
                }if(number < min){
                    min = number;
                }
            }
            else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println(" Maximum value "+ max + " Minimum value " + min);
        scanner.close();
    }
}
