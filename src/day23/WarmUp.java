package day23;

public class WarmUp {

    public static void main(String[] args) {

        int [] num = new int [7];

        num[0] = 7;
        num[1] = 17;
        num[2] = 27;
        num[3] = 37;
        num[4] = 47;
        num[5] = 57;
        num[6] = 67;



        System.out.println("\n Reverse version: ");
        for (int j = num.length-1; j >= 0 ; j--) {
            System.out.print("item =  " + num[j]);
        }

        int arraySize = num.length;
        int lastItemIndex = arraySize-1;

        int lastItemValue = num[lastItemIndex];

        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIndex = arraySize/2;

        System.out.println("middle item value = " + num[middleItemIndex]);


        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            int currentItem = num[i];
            sum = sum +num[i];

        }

        int max = 0;
        for (int i = 0; i <num.length-1 ; i++) {
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("max = " + max);
        int min = 0;
        for (int i = 0; i <num.length-1 ; i++) {
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("min = " + min);



    }
}
