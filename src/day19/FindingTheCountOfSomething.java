package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        //from 1 -100 print out all numbers can be divided by 15 without remainder
        // from 1 -100 count how many numbers can be divided by 15
        //Do  this one together
        
        int counter = 0;
        
        for (int i = 1; i < 100; i++) {
            if(i % 15 ==0){
                System.out.println(i+ "can be divided by 15 without remainder ");
                //counter = counter + 1;
                //counter +=1;
                ++counter;
        }

        }

        System.out.println("counter = " + counter);

        // given a string with value
        //find out how many 'a' showed in this String

        String name = "Tugba Karakoyun";

        //System.out.println(name.charAt(0)== 'a');

        int countOfA = 0;

        for (int x = 0; x < name.length(); x++) {

            System.out.println( name.charAt( x )     );

            if (name.charAt(x) == 'a' ){
                System.out.println("Bingo found it");
                ++countOfA;
            }

        }
        System.out.println("countOfA = " + countOfA);
    }
}
