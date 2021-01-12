public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 && feet != 0 && inches < 0 && inches !=0 && inches > 12 && inches != 12){
            return -1;
        }else {
//1 inch = 2.54 cm
// 1 feet = 12 inches
//centimeter in 1 feet
//centimeter in 1 inch
            double centimeterInFeet = 12 * 2.54 * feet;
            double centimeterInInches = 12 * inches;
            System.out.println(centimeterInFeet + " centimeters are present in " + feet + " feet");
            System.out.println(centimeterInInches + " centimeters are present in " + inches + " inches");
            return centimeterInFeet;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches !=0 && inches < 0){
            return -1;
        }else {
//feet in inches
            double feetInInches = inches/12;
            System.out.println(feetInInches + " feet is present in " + inches + " inches");
            return feetInInches;

        }
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(2,1);
        calcFeetAndInchesToCentimeters(2);
    }
}
