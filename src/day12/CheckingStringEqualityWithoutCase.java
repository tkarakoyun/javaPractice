package day12;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {

        String userName = "aBc123" ;

        boolean userNameCorrect = userName.equals("ABC123");

        System.out.println(  userNameCorrect );

        boolean  nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");

        System.out.println(  nameCheckIgnoreCase );

        String name = "Emre";

        boolean nameEqualsWithoutcase = name.equalsIgnoreCase("emre");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutcase);

        System.out.println(name.equalsIgnoreCase("emre") );
    }
}
