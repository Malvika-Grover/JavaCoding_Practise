package GroverMalvika;

import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
//        boolean hasNextInt1 = scanner.hasNextInt();
//        if (hasNextInt1) {
        for (int count = 1; count <= 10; count++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Enter number " + i);
                int x = scanner.nextInt();
                scanner.nextLine();
                sum = sum + x;
            }
            System.out.println("the sum of above 10 numbers is " + sum);
            break;
        }
        scanner.close();
        }
    }
//}
