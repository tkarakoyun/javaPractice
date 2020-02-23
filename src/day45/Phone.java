package day45;

public class Phone extends Electronic {


    //Sub Class inherit every visible instance field static field.
    //Sub class inherit every visible instance method and static method.



    double size;
    double price;


    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);

        //how to call showBrand Method
        p1.showBrand();

        //how to call displayUseElectricity static method
        displayUseElectricity();

        //static way
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();




    }
    public static void displayUseElectricity() {
        System.out.println("Displaying useElectricity  " + useElectricity);
    }
}
