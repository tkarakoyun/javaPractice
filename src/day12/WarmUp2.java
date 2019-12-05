package day12;

public class WarmUp2 {

    public static void main(String[] args) {

        int month = 10;

        if (month < 1 || month>12){
            System.out.println("Invalid Month.");
        }else if(month>=3 && month <=5){
            System.out.println("It is spring");
        }else if(month>=6 && month <=8){
            System.out.println("It is summer");
        }else if(month>=9 && month <=11){
            System.out.println("It is fall");
        }else if(month ==12 && month ==1 && month==2 ){
            System.out.println("It is winter");
        }else{
            System.out.println(" What a great year");
        }
    }
}
