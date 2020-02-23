package day21;

public class LoopControlStatement2 {

    public static void main(String[] args) {

        for (int x = 1; x <=100 ; x++) {
            if(x % 2 == 0){
                continue;       // the code says continue with the next number if it is odd.
            }
            System.out.println(x);
        }
    }
}
