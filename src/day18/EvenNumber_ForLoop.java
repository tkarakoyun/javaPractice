package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        //skip counting by two;

        System.out.println("For even numbers");
        for (int i = 0 ; i <100 ; i+=2){
            System.out.print(i+ " , ");
        }
        System.out.println();

        System.out.println("For odd numbers");

        for (int i = 1 ; i <100 ; i+=2){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Count by 3");

        for (int x = 0; x < 100 ; x +=3){
            System.out.print(x + " ");

        }

        System.out.println("----------------");

        for (int i = 0; i < 100 ; i++) {
             if(i % 5 ==0 && i %3==0){
                 System.out.println(i+ "is fizz buzz number");
             }

        }
    }
}
