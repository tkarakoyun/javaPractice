package day23;

public class StringArrayPractice {

    public static void main(String[] args) {


        String[] shows = {"Orville", "Gifted", "GOT", "Flash", "Arrow", "Super Girl"};

        int showCount = shows.length;
        System.out.println("shows count = " + showCount);

        for (int i = 0; i < showCount; i++) {

            //String currentShow = shows[i];
            //System.out.println(currentShow + " has character count: "+ currentShow.length());

            System.out.println(shows[i] + " has character count : " + shows[i].length());

        }
    }
}
