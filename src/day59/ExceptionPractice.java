package day59;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("The start");
        String name ="Furkan";


        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name? " );
        int targetIndex=scan.nextInt();

        try {
            System.out.println(name.charAt(targetIndex));
            //}catch(Exception e);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Message from getMessage method: "
                                +e.getMessage());

            System.out.println("Something unusual happened!!");
        }


        System.out.println("The End");

    }

}

