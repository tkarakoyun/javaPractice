package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {

        //&& is called short circuit AND
        // --> it does not check the next condition as long as the first condition is false
        //--> just like if you have multiple condition for rocket launching
        // isEngineRunning && isCommunicationSystemWorking && isAirEnough

        // & -->> Check each and every condition no matter what.
        // isEngineRunning && isCommunicationSystemWorking && isAirEnough
        //if isEngineRunning is false
        //if still check  isCommunicationSystemWorking
        //if still check isAirEnough
        //and eventually gibe you the outcome

        System.out.println(7>5 && 1>7);
        System.out.println(5>5 && 1>7);
        System.out.println(1>5 && 9>7);

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);

        //System.out.println(9/0);// ERROR!! Can not divide by 0
        // I want to check whether dividing 9 by 0 is 3
        //System.out.println(9/0 == 3);

        //Combine the result of
        //checking 5 is more than 10
        //and 9 divided by 0 is 3

        System.out.println(  5>10 && 9/3 ==3 );
        System.out.println(  5>10 & 9/3 ==3 ); //gives an error because of the single &



    }
}
