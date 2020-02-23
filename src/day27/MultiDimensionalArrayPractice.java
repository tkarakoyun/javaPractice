package day27;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String [] [] names = {{"Erdogan", "Kiymet"} , {"Tugba", "Aliye"} };

        System.out.println(names[0][1]);

        names [1][1]= "Defne";
        System.out.println(names[1][1]);


        System.out.println("===========================================");

        int[] [] numbers = {{1, 2, 3} , {4, 5, 6}, {7,8, 9}, {10, 11, 12, 12} };

        for (int i = 0; i <numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+ " ");

            }

        }

        System.out.println("===========================================");

        int[] [] ages = {{10}, {12,13, 14, 16, 17},{19,20,21,22,23}};

        for (int i = 0; i <ages.length ; i++) {

            for (int j = 0; j <ages[0].length ; j++) {
                if (ages[i][j] % 2 !=0){

                    System.out.println(ages[i][j]+ " ");

                }


            }

        }

    }
}
