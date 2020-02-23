package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar, Zhibek, Hasan, Muge, Orhan, Susan";

        students = students.replace(" ", "");
        System.out.println("students = " + students);

        String [] namesArrays = students.split(", ");

        System.out.println(Arrays.toString(namesArrays));
        System.out.println("length of namesArrays is " + namesArrays.length);
        int studentCount = namesArrays.length;
        
        for (int x = 0; x < studentCount; x++) {

            String name = namesArrays[x];
            System.out.println("Spelling = " + name);

            for (int i = 0; i <name.length() ; i++) {

                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();
        }


    }
}
