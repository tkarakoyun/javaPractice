package day10;

public class SeasonAction {

    public static void main(String[] args) {

        String season= "fall" ;

        switch (season) {

            case "spring":
                System.out.println("It is spring. Time to enjoy Cherry Blossoms");
                break;
            case "fall":
                System.out.println("It is fall. Time to enjoy Halloween");
                break;
            case "summer":
                System.out.println("It is summer. Time to swim");
                break;
            case "winter":
                System.out.println("It is winder. Time to snuggle and enjoy hot chocolate");
                break;
            default:
                System.out.println("You did not enter a season name.");
                break;
        }
    }
}
