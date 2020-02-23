package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";

        String [] heroSplitted = hero1.split("-");
       // String heroCode = heroSplitted[0];
       // String fullName = heroSplitted[1];

        String stars = "";

        for (int i = 1; i <=heroSplitted[1].length() ; i++) {
            stars += "*";

        }

        System.out.println("Hero1 = " + hero1);
        System.out.println("HeroX = " + hero1.replace(heroSplitted[1], stars));

    }
}
