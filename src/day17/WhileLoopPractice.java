package day17;

public class WhileLoopPractice {


    public static void main(String[] args) {


        int counter = 1;

        while (counter <= 5){
            System.out.print(counter + " ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter = " + counter); //at this point counter value is 6.
        //now I want to count from 5 to 1, using same counter
        // 6 >=1 5 >=1 4 >=1 3 >=1 2 >=1 2 >=1


        while(counter>=1){
            --counter;
            System.out.print(counter+ " ");


        }

        System.out.println();
        System.out.print("counter after decrement = " +counter);
    }
}
