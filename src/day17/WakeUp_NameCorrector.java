package day17;

public class WakeUp_NameCorrector {

    public static void main(String[] args) {

        String name = "tugba";

        String name2 = name.toUpperCase().substring(0,1);
        name2 += name.substring(1).toLowerCase();

        System.out.println("name2 = " + name2);


    }
}
