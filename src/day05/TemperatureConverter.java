package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" What is the temperature is F ?");

        double fahrenheit = scan.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius");

    }
}
