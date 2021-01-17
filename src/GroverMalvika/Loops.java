package GroverMalvika;

public class Loops {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println( "*****************" );

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println( "*****************" );

        count = 0;
        do {
            count++;
            System.out.println("Count value is " + count);
        }while (count != 6);
    }
}

