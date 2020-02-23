package day53;

import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple ("Sweet", "red", "Fuji");

        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();

        System.out.println("//--------");

        Fruit f1 = a1;

        System.out.println("f1.color = " + f1.color);
        System.out.println("a1.taste = " + a1.taste);

        f1.getDigested();
        f1 = new Orange ("Sour-Sweet", "Redish", 11);
        f1.getDigested();

        System.out.println(f1.toString());
        //System.out.println(f1); this is also the same thing.




        Apple f2 = new Apple ("Crispy but tasteless", "hot red", "Gala");

        Fruit f3 = new Orange ("sour", "orange", 12);

        Fruit f4 = new Orange ("very sour", "Blood Red", 10);


        Fruit[] myFruits = { f1, f2, f3, f4};

        for( Fruit each: myFruits){

            each.getDigested();
        }

        List<Fruit> fruitList = Arrays.asList(f1, f2, f3, f4);

        for(Fruit each : fruitList){

            System.out.println("each.toString() = " + each.toString() );
            System.out.println("Class type : " + each.getClass().getSimpleName() );
        }

    }

}
