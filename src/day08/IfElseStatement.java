package day08;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 45;

        boolean amISpeeding = (yourCurrentSpeed > speedLimit) ;


        if (yourCurrentSpeed >=100) {

            System.out.println("That was fast! You will now get a ticket!");
        }

        else {
            System.out.println("Good Job!");
        }


        ///// other way to solve this is below.


        int Limit = 60;
        int currentSpeed = 45;
        boolean speeding = ( currentSpeed > Limit);

        if (speeding) {

            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");

        }else {

            System.out.println("go shopping");
            System.out.println("buy ice cream");
            System.out.println("enjoy your day. ");
        }

        System.out.println("The end");

    }
}
