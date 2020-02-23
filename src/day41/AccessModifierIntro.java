package day41;

public class AccessModifierIntro {

    public static void main(String[] args) {



        // access modifier can be used for fields and methods , there are 4 of them
        // currently we care about of 3 :
        // public --->> accessible anywhere
        // (default)  --->> accessible only within the same package
        // private --->> accessible only within the same class

        Person p1 = new Person();
//        p1.name = "Hasan" ;
//        p1.age = 19 ;
//        p1.ssn = 123456789;

        p1.setAll("Hasan", 34, 1231231231);
        System.out.println("p1 = " + p1);

        //System.out.println(p1.name);
        System.out.println("p1.getName() = " + p1.getName());
        p1.setName("Emma");
        System.out.println("p1.getName() = " + p1.getName());
        p1.setAge(21);
        p1.setSsn(987654321);

        int emmaAge = p1.getAge();
        System.out.println("emmaAge = " + emmaAge);

        System.out.println("p1 = " + p1);


    }
}
