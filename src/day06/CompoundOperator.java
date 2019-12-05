package day06;

public class CompoundOperator {
    public static void main(String[] args) {

        int studentOnline = 263;
        studentOnline = studentOnline + 5 ;

        System.out.println("5 students joined " + studentOnline);

        studentOnline =  studentOnline - 3;

        System.out.println("3 students left the class "+ studentOnline);

        studentOnline = studentOnline * 2;

        System.out.println("Student number has doubled " + studentOnline);

        studentOnline = studentOnline / 3;

        System.out.println("Thirds of the students have dropped " + studentOnline);


    }
}
