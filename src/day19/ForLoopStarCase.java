package day19;

public class ForLoopStarCase {

    public static void main(String[] args) {

        String star = "";

        star = star + " * " ;
        System.out.println(star);

        star = star + " * " ;
        System.out.println(star);

        star = star + " * " ;
        System.out.println(star);

        star = star + " * " ;
        System.out.println(star);


        System.out.println("-----Below is the easy way--------");
        String star1 = "";

        for (int i = 1 ; i <=10; i++) {

            star1 = star1 + " * "; //or can also do -  star+= " * ";
            System.out.println(i+ " " + star1);

        }
    }
}
