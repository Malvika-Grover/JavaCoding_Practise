package GroverMalvika;

public class MethodOverloading_UNDONE {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches >= 12){

            double centimeterInFeet = 12 * 2.54 * feet * inches;
            System.out.println(centimeterInFeet);
            return centimeterInFeet;

        }else
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0){
            double feetInInches = inches/12;
            System.out.println(feetInInches);
            return feetInInches;
        }
        else
            return -1;

    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(1,1);

    }

}
