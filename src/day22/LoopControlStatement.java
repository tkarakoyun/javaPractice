package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome";

        for (int i = 0; i < msg.length(); i++) {

            if (i%2==1){
                continue;
            }
            System.out.println(msg.charAt(i));
        }

        // task 2

        for (int i = 0; i < msg.length(); i++) {
            
            String currentChar = msg.substring(i, i+1) ;
            
            if (currentChar.equalsIgnoreCase("j")) {
                break;
            }
            System.out.println("currentChar = " + currentChar);
            }
            
        }
        }

