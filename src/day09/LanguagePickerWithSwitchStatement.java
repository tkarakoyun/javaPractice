package day09;

public class LanguagePickerWithSwitchStatement {

    public static void main(String[] args) {

        int languageCode = 5;
        String greeting = "";

        switch (languageCode) {

            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Salam");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Privet");
                break;
            case 5:
                System.out.println("Merhaba");
                break;
            case 6:
                System.out.println("Szia");
                break;
            case 7:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Can't find the language");
        }

    }
}
