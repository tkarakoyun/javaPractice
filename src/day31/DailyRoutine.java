package day31;

public class DailyRoutine {

    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm? Open your eyes again");
        System.out.println("--------------------");
    }
    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Press the button make your coffee");
        System.out.println("-------------------");

    }
    public static void setUpKids(){
        System.out.println("Kiss your kids to wake them up");
        System.out.println("Wake them up for 10 times");
        System.out.println("Preparee their breakfast and lunch");
        System.out.println("Eat with them");
        System.out.println("-------------------");
    }
    public static void takeThemToSchool(){
        System.out.println("Them them to school bus");
        System.out.println("Say good Bye");
        System.out.println("-----------");
    }
    public static void studyJava(){
        System.out.println("Thnk about java waking up");
        System.out.println("Think about java while drinking coffee");
        System.out.println("Think about java while preparing kids for school");
        System.out.println("Think about java while taking kids to school");
        System.out.println("Eventually sit down and study java, practice practice!!");
        System.out.println("-----------------");
    }
    public static void sayILoveJava300Times(){
        for (int i = 1; i <=300 ; i++) {
            System.out.print("I Love Java  | ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        wakeUp();
        drinkCoffee();
        setUpKids();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();

    }
}
