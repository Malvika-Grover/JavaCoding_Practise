package GroverMalvika;
public class SwitchStatements {
    public static void main(String[] args) {
        String SwitchCharacterValue = "c";

        switch(SwitchCharacterValue.toUpperCase()){
            case "A": case "B": case "C": case "D":
                System.out.println("Value found " + SwitchCharacterValue);
                break;
            default:
                System.out.println("Values were not A, B, C or D");
                break;
        }
    }
}
