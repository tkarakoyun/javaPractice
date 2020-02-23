package day21;

public class NameBreaker {

    public static void main(String[] args) {

                    // 01234567890
        String name = "Nursultan";

        //get out when you see the letter b

        for (int x = 0; x < name.length() ; x++) {

            char currentChar = name.charAt(x);

            if (currentChar == 'l'|| currentChar == 'L') {
                System.out.println("Found It!!");
                break;
            }
            System.out.println(currentChar);

            }

        }

    }

