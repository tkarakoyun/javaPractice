package day59;

public class General {

    public static void main(String[] args) {

        //Object o = new String ("abc");
        System.out.println("The start");
        String str = null;


        try{
            System.out.println(str.charAt(0));
            System.out.println("End of Try");

        }catch(NullPointerException bla){
            System.out.println("No Object here!!");

        }catch(Exception e ){
            System.out.println("This is the rest of exceptions");

        }

        System.out.println("the end");
    }

}
