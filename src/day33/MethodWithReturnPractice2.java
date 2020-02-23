package day33;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {
        System.out.println(getDaysOfTheWeekFromNumber(5));
        System.out.println(getDaysOfTheWeekFromNumberWithoutSwitch(6));

        //Create an int array that has 5 numbers, test your code with
        int[]allCodes = {5,3,11,4,33};
        for (int x = 0; x <allCodes.length ; x++) {
            String day = getDaysOfTheWeekFromNumber(allCodes[x]);
            System.out.println("day = " + day);
        }
        System.out.println("-------------");
        for(int eachCode : allCodes){
            System.out.println("each day = " + getDaysOfTheWeekFromNumber(eachCode));
        }


    }
    public static String getDaysOfTheWeekFromNumber(int dayCode){
        String dayName = "";

        switch(dayCode){


            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Funday";


        }

        return dayName;
    }

    public static String getDaysOfTheWeekFromNumberWithoutSwitch(int dayCode){
        String[] daysArray = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String day ="";
        if(dayCode>0 && dayCode<=7){
            day=daysArray[dayCode-1];
        }else{
            day="Funday";
        }
        return day;
    }
}
