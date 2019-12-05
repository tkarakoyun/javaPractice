package day19;

public class SpeedAction {

    public static void main(String[] args) {

// This is one way.

        for (int i = 1; i < 10 ; i++) {
            System.out.print("i = " + i+ " ");
            
        }

        System.out.println();
        System.out.println("----------");
        // this is another way

        int start = 5;
        int end = 10;

        for (int i = start; i < end ; i++) {
            System.out.print("i = " + i+ " ");
        }
        
        
    }
}
