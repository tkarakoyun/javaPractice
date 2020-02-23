package day34;

public class OverloadingPractice {

    public static void main(String[] args) {
        add(15);
        add(15,45);
        add(15, 43, 67);
        add(15L, 23L);

    }

    public static void add(int i){
        System.out.println(i+100 + " calling add(int i)");
    }
    public static void add(int a, int b){
        System.out.println(a + b+ " calling add(int a, int b)");
    }
    public static void add(int a, int b, int c){
        System.out.println(a + b + c + " calling add(int a, int b, int c)");
    }
    public static void add(long a, long b){
        System.out.println(a + b+ " calling add(long a, long b)");
    }
}
