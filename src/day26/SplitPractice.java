package day26;

public class SplitPractice {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 month Survey";

        char[] surveyChars = survey.toCharArray();


        // using for each loop
        for (char each : surveyChars){
            System.out.println("each char is :" + each);
        }


        // using fori loop
        for (int x = 0; x < surveyChars.length ; x++) {
            System.out.println("each char is: " + surveyChars[x]);
        }
            // while loop
        int x = 0;
        while(x<surveyChars.length){
            System.out.println("each char is: " + surveyChars[x]);
            x++;
        }
        // do while loop

        int y = 0;
        do{
            System.out.println("each char is: " + surveyChars[y]);
            y++;

        }while (y<surveyChars.length);

    }
}
