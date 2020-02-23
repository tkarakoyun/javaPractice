package day59;

import java.util.Scanner;

public class ExceptionPractice2 {

    public static void main(String[] args) {

        System.out.println("The start");
        String name ="Furkan";


        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name? " );


        try {
            int targetIndex=scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("end of try");
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Something unusual happened!!");
        }


        System.out.println("The End");

    }

}

