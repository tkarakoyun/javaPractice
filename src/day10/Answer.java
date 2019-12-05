package day10;

public class Answer {

    public static void main(String[] args) {

        String myAnswers = "";
        int myNumber = 7;

        if (myNumber %5==0 ){

            myAnswers= "Fizz Number";

        }else{
            myAnswers = "Not a Fizz Number";
        }
        System.out.println("My number is: " + myNumber +", " + "It is " + myAnswers);
    }
}
