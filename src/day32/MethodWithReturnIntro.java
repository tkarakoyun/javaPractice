package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {
        //giveMeMyName();
        //System.out.println("name = " + name);
    }
    public static int doubleTheNumber(int num){
        System.out.println("I am going to double the value of " + num);
        int result = num * 2;
        return result;
    }

    public static String giveMeMyName(){
        return "Akbar";
    }
}
