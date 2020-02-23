package day33;

public class MethodWithReturnPractice3 {

    public static void main(String[] args) {

        System.out.println(calculateAgeFromBirthYear(1999));
    }

    public static int calculateAgeFromBirthYear(int birthyear){
        //I want to take out negative scenario first and just return 0.
        if(birthyear<=1900 || birthyear>=2020){
            return 0;
        }
        //If i reach this point, it means the birth year is valid

        return 2019 - birthyear;

    }
}
