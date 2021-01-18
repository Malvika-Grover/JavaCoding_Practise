package GroverMalvika;

public class EvenNumber {

    public static boolean isEvenNumber(int x) {
        if (x%2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int count = 0;
        int x = 4;
        int finalx = 20;
        while (x<finalx){
            x++;
            if (!isEvenNumber(x)){
                count ++;
                continue;
        }
            System.out.println("Even number " + x);
            if (count == 5) {
                System.out.println("Breaking the loop as I have encountered 5 enteries showing above");
                break;

        }
        }
    }
}
