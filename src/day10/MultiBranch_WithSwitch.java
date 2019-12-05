package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald, What can I get for you?");

        String order ="";
        int itemNumber = 11;

        switch(itemNumber){

            case 11:
            System.out.println("You have selected 11");
            order = "Burger";
            break;
            case 5:
            System.out.println("You have selected 5");
            order = "French Fry";
            break;
            case 8:
            System.out.println("You have selected 8");
            order = "Nugget";
            break;
            case 35:
            System.out.println("You have selected 35");
            order = "Ice Cream";
            break;
            default:
            System.out.println("you have selected unknown item from the menu!");
            order = "unknown";
            break;

        }
        System.out.println("Your order is " + order);

    }
}
