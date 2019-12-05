package day09;

import java.sql.SQLOutput;

public class LanguagePicker {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center:");
        System.out.println("Please select a language option;");
        String greeting ="";
        int languageCode = 1;
        if (languageCode == 1) {
            greeting = "Hello";
        } else if (languageCode ==2){
            greeting="Salam";
        } else if (languageCode ==3){
        greeting="Hola";
        } else if (languageCode ==4){
            greeting="Privet";
        } else if (languageCode ==5){
            greeting="Merhaba";
        } else if (languageCode ==6){
            greeting="Szia";
        } else if (languageCode ==2) {
            greeting = "Bonjour";

        }else
            greeting = "Unknown";
        System.out.println(greeting + ", SDET");
    }
}
