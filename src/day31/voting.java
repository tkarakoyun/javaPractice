package day31;

public class voting {

    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);
    }

    public static void checkEligibility(int age){
            //int age = 15;

            if (age > 18) {

                System.out.println("You are eligible to vote");
            } else {
                System.out.println("you are not eligible");
            }
        }


}



