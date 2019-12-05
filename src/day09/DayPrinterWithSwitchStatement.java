package day09;

public class DayPrinterWithSwitchStatement {

    public static void main(String[] args) {

        int dayCode = 7;

        switch (dayCode){

            case 1 :
                System.out.println("Today is Monday!");
                break; // use it to get out of this branch
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is Wednesday!");
                break;
            case 4:
                System.out.println("Today is Thursday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
            case 7:
                System.out.println("Today is Sunday!");
                break;
            default:
                System.out.println("Day is Unknown!");


        }
    }
}
