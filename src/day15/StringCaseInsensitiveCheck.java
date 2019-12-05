package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("name.contains(\"st\") Result is : " + name.contains("st"));

        // I wanna check whethe this name contains st no
        //matter of the case.
        // So I want to store the uppercase version of this name
        //and then check for ST.

        String upperCaseName = name.toUpperCase(); //This will make the name all upper case.
        System.out.println("upperCaseName contains ST or not?"+ upperCaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase(); //This will make it lower case.
        System.out.println("lowerCaseName contains st or not?" + lowerCaseName.contains("st"));

        //This is called method chaining, combining multiple method call.
        //Make my name all lowercase (String) then check whether it contains lower case.

        System.out.println(name.toLowerCase().contains("st"));
        //System.out.println(name.length().toUpperCase() ); // Bad Idea.
        //because length is int - toUpperCase is string.

    }
}
