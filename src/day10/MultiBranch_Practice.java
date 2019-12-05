package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald, What can I get for you?");
        String order ="";

        int itemNumber = 35;

        if(itemNumber==11) {
            System.out.println("You have selected 11");
            order = "Burger";
        }else if (itemNumber ==5){
            System.out.println("You have selected 5");
            order = "French Fry";
        }else if (itemNumber ==8){
            System.out.println("You have selected 8");
            order = "Nugget";
        }else if (itemNumber ==35) {
            System.out.println("You have selected 35");
            order = "Ice Cream";
        }else{
            System.out.println("you have selected unknown item from the menu!");
            order = "unknown";

        }
        System.out.println("Your order is " + order);
    }

}
