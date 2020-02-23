package day51;

import java.util.ArrayList;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {
        Person p1 = new Person("Tugba", 28);

        Person p2 = new Person("Defne", 30);

        Person p3 = new Person ("ALiye", 23);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);



        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));


        int result = p2.compareTo(new Person("Tayfun", 27));

        System.out.println("result = " + result);

       /*
        if(p1.compareTo(p3) == 1){
            System.out.println(p3.name);
        }else{
            System.out.println(p1.name);
        }
        */

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person ("Tayfun", 27));
        System.out.println("lst = " + lst);        

     /*


        if (p1.age > p2.age) {
            System.out.println(1);
        } else if(p1.age<p2.age) {
            System.out.println(-1);
        } else{
            System.out.println(0);
    }
      */
    }




}
