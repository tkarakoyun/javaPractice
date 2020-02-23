package day32;

public class CharacterActions {
    public static void main(String[] args) {

        printAtoZ();
        printZtoA();

    }
    public static void printAtoZ(){
        for (char iChar = 'A'; iChar<='Z'; iChar++){
            System.out.print(iChar+" ");
        }
        System.out.println();
    }
    public static void printZtoA() {
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println();
    }
}
