package day11;

public class LightOnOff {

    public static void main(String[] args) {

        String targetOption ="bd";

        switch (targetOption){
            case "bd":
                System.out.println("You can turn on bedroom light  . ");
                break;
            case "kn":
                System.out.println(" You can turn on kitchen light. ");
                break;
            case "Lr":
                System.out.println("You can turn on living room light");
                break;
            case "ha":
                System.out.println(" you can  turn on hallway light.");
            default:
                System.out.println("wrong option");
                break;


        }
    }
}
