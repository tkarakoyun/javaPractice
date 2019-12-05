package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int apple = 10;

        apple = apple + 1;

        apple +=1;

        ++apple;



        System.out.println("total number of apples: " +  apple);
        // last three lines are doing the same thing. they are all adding by 1.

        int banana = 20;

        banana = banana - 1;

        banana -= 1;

        --banana;

        System.out.println("Number of bananas after subtracting " + banana);

        //System.out.println(++banana);

        System.out.println("used ++ to increment and concatenate: " +       (++banana));
    }
}
