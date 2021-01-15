package GroverMalvika;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("GroverMalvika.Hello World");
//        int myFirstNumber = 5;
//        int mySecondNumber = 6;
//        int myThirdNumber = 12;
//        int myTotal = myFirstNumber+mySecondNumber+ myThirdNumber;
//        System.out.println(myTotal);
//        int myLastOne = myTotal-1000;
//        System.out.println(myLastOne);
//
//        int myMinValue = Integer.MIN_VALUE;
//        int myMaxValue = Integer.MAX_VALUE;
//        System.out.println("Minimum Integer Value: " + myMinValue + "\n" + "Maximum Integer Value: " + myMaxValue);
//        System.out.println("Overflow " + (myMaxValue+1));
//        System.out.println("Underflow: " + (myMinValue-1));
//
//        long myLongValue = 10L;
//        System.out.println(myLongValue);
        //we use L in the end of long declaration because if we don't do that, the computer takes it as
        //an integer




//        byte newByteValue = 10;
//        short newShortValue = 20;
//        int newIntValue = 30;
//        long newLongValue = 50000+10*(newByteValue+newShortValue+newIntValue);
//        System.out.println(newLongValue);
//
//        short shortValue = (short) (50000+10*(newByteValue+newShortValue+newIntValue));

//        int a = 5 / 3;
//        float b = 5f / 3f;
//        double c = 5d / 3d;
//        System.out.println("Integer: " + a);
//        System.out.println("Float: " + b);
//        System.out.println("Double: " + c);

//        double pound = 10d;
//        double kilogram = 0.45359237d * pound;
//        System.out.println("Total kilogram is: " + kilogram);

//        char first = 'D';
//        char second = '\u00a9';
//        System.out.println(first);
//        System.out.println(second);
//
//        int abc = 100;
//        if (abc == 10){
//            System.out.println("You've scored = "+ abc + " YAAYYYY !!!!");
//        }
//        else
//            System.out.println("You've scored = "+ abc + " You're failing, buckle up");

//        boolean is_active = true;
//        if(is_active = true){
//            System.out.println("GroverMalvika.Hello.... Welcome Home");
//        }

//        int a = 11;
//        boolean b = (a == 10) ? true : false ;
//        if (b)
//            System.out.println("b won");
//        else
//            System.out.println("a won");

/*
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double caclulation1 = (firstVariable+secondVariable)*100.00d;
        double calculation2 = caclulation1 % 40.00d;
        boolean values = (calculation2 == 0 ) ? true : false;
        System.out.println(values);
        if (values == !true){
            System.out.println("Got some reminder");
        }*/

/*        boolean gameOver = true;
        int score = 5000;
        int level = 5;
        int bonus = 800;*/
        Calculations(true, 499, 5, 100);


    }

    public static int Calculations(boolean gameOver, int score, int level, int bonus ) {
        int finalScore = 0;
        if (score >= 500 && level >= 5) {
            finalScore = score + (level * bonus);
            System.out.println("You have done a great job!! Your score is :" + finalScore);
        } else {
            System.out.println("Try again next time, Your score is : " + finalScore);
        }
        return finalScore;
    }
}
