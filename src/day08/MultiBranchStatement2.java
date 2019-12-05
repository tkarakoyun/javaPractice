package day08;

public class MultiBranchStatement2 {

    public static void main(String[] args) {

        int currentSpeed = 90;

        if (currentSpeed>90) {
            System.out.println("Jail Time");
        } else if (currentSpeed>80){
            System.out.println("Reckless driving");
        }else if (currentSpeed >  70){
            System.out.println("point taken");
        }else if (currentSpeed > 60) {
            System.out.println("warning");
        }else{
            System.out.println("Keep Driving.");
        }
    }
}
