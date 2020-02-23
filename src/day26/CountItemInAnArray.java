package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes ={"Iron Man ", "Captain America", "Spiderman", "Black Panter", "Hulk", "Black Widow",
        "Wanda", "Captain Marvel"};

        System.out.println("Marvel Heroes = "+ Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero Count = " + sizeOfArray);

        String itemToSearch ="Iron" ;
        int countOfItem= 0;

        for (String eachHero : marvelHeroes){
            if(eachHero.equals(itemToSearch)){ // change it .contains if you are looking for a part of a word. 
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);
        
        int cntOfBlackInName = 0;
        
        for (String eachHero : marvelHeroes){
            
            if (eachHero.toLowerCase().contains("black")){
                cntOfBlackInName++;
            }
        }

        System.out.println("cntOfBlackInName = " + cntOfBlackInName);
    }
}
