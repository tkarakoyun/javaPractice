package day54;

public class AnimalShow {

    public static void main(String[] args) {
// Dog IS-A Dog
// Dog IS-A Animal
// Dog IS-A IndoorPet

        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.speak();
        d1.play();

        Animal a1 = d1;
        a1.speak();

        Object o1 = d1;

        IndoorPet p1 = d1;

    }

}