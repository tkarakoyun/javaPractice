package day29;

public class HeroIdentity {

    public static void main(String[] args) {


        String hero1 = "Superman-Clark J Kent";

        String [] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0; i < nameCharCount; i++) {

            stars = stars + "*"; // stars += "*"; <-- this is the same thing.


        }

        System.out.println(fullName);
        System.out.println(stars);

        String heroX = heroCode + "-" + stars;
        System.out.println("Hero 1 = " + hero1);
        System.out.println("Hero X = " + heroX);

    }
}
