package day14;

public class review {

    public static void main(String[] args) {

        String str = "I like Pumpkin";

        //System.out.println(str.equals("pumpkin"));

        //contains:
        //it checks whether a string exists in another string

        System.out.println("does it contain pumpkin");
        System.out.println(  str.contains("Pumpkin"));
                                //true
        boolean gotPumpkin = str.contains("Pumpkin");

        //shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("n");
        System.out.println("endWithPumpkin = " + endWithPumpkin);
        





    }
}
